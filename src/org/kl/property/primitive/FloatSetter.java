package org.kl.property.primitive;

public final class FloatSetter {
	private float value;
	
	public FloatSetter(float value) {
		this.value = value;
	}
	
	public FloatSetter of(float value) {
		return new FloatSetter(value);
	}
	
	public void set(float value) {
		this.value = value;
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
