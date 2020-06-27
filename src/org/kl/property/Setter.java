package org.kl.property;

import java.util.function.UnaryOperator;

public final class Setter<T> {
	private T value;
	private UnaryOperator<T> setter;
	
	public Setter(T value) {
		this.value = value;
	}
	
	public Setter<T> of(T value) {
		return new Setter<T>(value);
	}
	
	public void set(T value) {
		if (setter != null) {
			this.value = setter.apply(value);
		} else {
			this.value = value;
		}
	}
	
	public Setter<T> set(UnaryOperator<T> setter) {
		this.setter = setter;
		
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
		
		Setter<T> other = (Setter<T>) object;
		
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
		return "Setter [value= " + value + "]";
	}
}
