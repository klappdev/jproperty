package org.kl.property;

import java.util.function.UnaryOperator;

public final class Getter<T> {
	private final T value;
	private UnaryOperator<T> getter;
	
	public Getter(T value) {
		this.value = value;
	}
	
	public Getter<T> of(T value) {
		return new Getter<T>(value);
	}
	
	public T get() {
		if (getter != null) {
			return getter.apply(value);
		}
		
		return value; 
	}
	
	public Getter<T> get(UnaryOperator<T> getter) {
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
