package org.kl.property.primitive;

public final class FloatGetter {
	private final float value;
	
	public FloatGetter(float value) {
		this.value = value;
	}
	
	public FloatGetter of(float value) {
		return new FloatGetter(value);
	}
	
	public float get() { 
		return value; 
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
		
		FloatGetter other = (FloatGetter) object;
		
		if (Float.floatToIntBits(value) != Float.floatToIntBits(other.value)) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "FloatGetter [value= " + value + "]";
	}
}
