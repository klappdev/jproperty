package org.kl.property.primitive;

import org.kl.property.lambda.FloatUnaryOperator;

public final class FloatSetter {
	private float value;
	private FloatUnaryOperator setter;
	
	public FloatSetter(float value) {
		this.value = value;
	}
	
	public FloatSetter of(float value) {
		return new FloatSetter(value);
	}
	
	public void set(float value) {
		if (setter != null) {
			setter.applyAsFloat(value);
			return;
		}
		
		this.value = value;
	}
	
	public FloatSetter set(FloatUnaryOperator setter) {
		this.setter = setter;
		
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
		
		FloatSetter other = (FloatSetter) object;
		
		if (Float.floatToIntBits(value) != Float.floatToIntBits(other.value)) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "FloatSetter [value= " + value + "]";
	}
}
