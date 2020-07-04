package org.kl.property;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import org.kl.property.error.PropertyException;

public final class Getter<T> {
	private final T value;
	private UnaryOperator<T> getter;
	private Predicate<T> preCondition;
	private Predicate<T> postCondition;
	
	public Getter(T value) {
		this.value = value;
	}
	
	public Getter<T> of(T value) {
		return new Getter<T>(value);
	}
	
	public T get() {
		T result;
		
		if (preCondition != null && !preCondition.test(value)) {
			throw new PropertyException("Preconditions not satisfied in getter");
		}
		
		if (getter != null) {
			result = getter.apply(value);
		} else {
			result = value;
		}
		
		
		if (postCondition != null && !postCondition.test(this.value)) {
			throw new PropertyException("Postconditions not satisfied in getter");
		}
		
		return result; 
	}
	
	public Getter<T> get(UnaryOperator<T> getter) {
		this.getter = getter;
		
		return this;
	}
	
	public Getter<T> pre(Predicate<T> preCondition) {
		this.preCondition = preCondition;
		
		return this;
	}
	
	public Getter<T> post(Predicate<T> postCondition) {
		this.postCondition = postCondition;
		
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
		
		Getter<T> other = (Getter<T>) object;
		
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
		return "Getter [value= " + value + "]";
	}
}
