package org.kl.property;

import java.util.function.UnaryOperator;

public final class Property<T> {
	private T value;
	private UnaryOperator<T> setter;
	private UnaryOperator<T> getter;
	
	public Property(T value) {
		this.value = value;
	}
	
	public Property<T> of(T value) {
		return new Property<T>(value);
	}
	
	public void set(T value) {
		if (setter != null) {
			this.value = setter.apply(value);
		} else {
			this.value = value;
		}
	}
	
	public Property<T> set(UnaryOperator<T> setter) {
		this.setter = setter;
		
		return this;
	}
	
	public T get() {
		if (getter != null) {
			return getter.apply(value);
		}
		
		return value; 
	}
	
	public Property<T> get(UnaryOperator<T> getter) {
		this.getter = getter;
		
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