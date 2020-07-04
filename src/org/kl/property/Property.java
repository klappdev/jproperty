package org.kl.property;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import org.kl.property.error.PropertyException;

public final class Property<T> {
	private T value;
	private UnaryOperator<T> setter;
	private UnaryOperator<T> getter;
	
	private Predicate<T> preConditionSetter;
	private Predicate<T> postConditionSetter;
	private Predicate<T> preConditionGetter;
	private Predicate<T> postConditionGetter;
	
	public Property(T value) {
		this.value = value;
	}
	
	public Property<T> of(T value) {
		return new Property<T>(value);
	}
	
	public void set(T value) {
		if (preConditionSetter != null && !preConditionSetter.test(value)) {
			throw new PropertyException("Preconditions not satisfied in setter");
		}
		
		if (setter != null) {
			this.value = setter.apply(value);
		} else {
			this.value = value;
		}
		
		if (postConditionSetter != null && !postConditionSetter.test(this.value)) {
			throw new PropertyException("Postconditions not satisfied in setter");
		}
	}
	
	public Property<T> set(UnaryOperator<T> setter) {
		this.setter = setter;
		
		return this;
	}
	
	public T get() {
		T result;
		
		if (preConditionGetter != null && !preConditionGetter.test(value)) {
			throw new PropertyException("Preconditions not satisfied in getter");
		}
		
		if (getter != null) {
			result = getter.apply(value);
		} else {
			result = value;
		}
		
		if (postConditionGetter != null && !postConditionGetter.test(this.value)) {
			throw new PropertyException("Postconditions not satisfied in getter");
		}
		
		return result; 
	}
	
	public Property<T> get(UnaryOperator<T> getter) {
		this.getter = getter;
		
		return this;
	}
	
	public Property<T> preSet(Predicate<T> preConditionSetter) {
		this.preConditionSetter = preConditionSetter;
		
		return this;
	}
	
	public Property<T> postSet(Predicate<T> postConditionSetter) {
		this.postConditionSetter = postConditionSetter;
		
		return this;
	}
	
	public Property<T> preGet(Predicate<T> preConditionGetter) {
		this.preConditionGetter = preConditionGetter;
		
		return this;
	}
	
	public Property<T> postGet(Predicate<T> postConditionGetter) {
		this.postConditionGetter = postConditionGetter;
		
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		
		if (object == null) {
			return false;
		}
		
		if (getClass() != object.getClass()) {
			return false;
		}
		
		Property<T> other = (Property<T>) object;
		
		if (value == null) {
			if (other.value != null) {
				return false;
			}
		} else if (!value.equals(other.value)) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "Property [value= " + value + "]";
	}
}