package org.kl.property.primitive;

import org.kl.property.lambda.CharUnaryOperator;

public final class CharProperty {
	private char value;
	private CharUnaryOperator setter;
	private CharUnaryOperator getter;
	
	public CharProperty(char value) {
		this.value = value;
	}
	
	public CharProperty of(char value) {
		return new CharProperty(value);
	}
	
	public void set(char value) {
		if (setter != null) {
			this.value = setter.applyAsChar(value);
		} else {
			this.value = value;
		}
	}
	
	public CharProperty set(CharUnaryOperator setter) {
		this.setter = setter;
		
		return this;
	}
	
	public char get() {
		if (getter != null) {
			return getter.applyAsChar(value);
		}
		
		return value; 
	}
	
	public CharProperty get(CharUnaryOperator getter) {
		this.getter = getter;
		
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
		
		CharProperty other = (CharProperty) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "CharProperty [value= " + value + "]";
	}
}
