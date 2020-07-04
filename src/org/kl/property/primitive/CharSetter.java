package org.kl.property.primitive;

import org.kl.property.lambda.CharUnaryOperator;

public final class CharSetter {
	private char value;
	private CharUnaryOperator setter;
	
	public CharSetter(char value) {
		this.value = value;
	}
	
	public CharSetter of(char value) {
		return new CharSetter(value);
	}
	
	public void set(char value) {
		if (setter != null) {
			setter.applyAsChar(value);
			return;
		}
		
		this.value = value;
	}
	
	public CharSetter set(CharUnaryOperator setter) {
		this.setter = setter;
		
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + value;
		
		return result;
	}

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
		
		CharSetter other = (CharSetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "CharSetter [value= " + value + "]";
	}
}
