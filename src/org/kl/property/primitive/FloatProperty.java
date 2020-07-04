package org.kl.property.primitive;

import org.kl.property.lambda.FloatUnaryOperator;

public final class FloatProperty {
	private float value;
	private FloatUnaryOperator setter;
	private FloatUnaryOperator getter;
	
	public FloatProperty(float value) {
		this.value = value;
	}
	
	public FloatProperty of(float value) {
		return new FloatProperty(value);
	}
	
	public void set(float value) {
		if (setter != null) {
			this.value = setter.applyAsFloat(value);
		} else {
			this.value = value;
		}
	}
	
	public FloatProperty set(FloatUnaryOperator setter) {
		this.setter = setter;
		
		return this;
	}
	
	public float get() {
		if (getter != null) {
			return getter.applyAsFloat(value);
		}
		
		return value; 
	}
	
	public FloatProperty get(FloatUnaryOperator getter) {
		this.getter = getter;
		
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + Float.floatToIntBits(value);
		
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
		
		FloatProperty other = (FloatProperty) object;
		
		if (Float.floatToIntBits(value) != Float.floatToIntBits(other.value)) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "FloatProperty [value= " + value + "]";
	}
}
