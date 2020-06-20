package org.kl.property.primitive;

public final class DoubleSetter {
	private double value;
	
	public DoubleSetter(double value) {
		this.value = value;
	}
	
	public DoubleSetter of(double value) {
		return new DoubleSetter(value);
	}
	
	public void set(double value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		
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
		
		DoubleSetter other = (DoubleSetter) object;
		
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value)) {
			return false;
		}
		
		return true;
	}
	
	
}
