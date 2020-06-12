package org.kl.property.primitive;

public final class DoubleGetter {
	private final double value;
	
	public DoubleGetter(double value) {
		this.value = value;
	}
	
	public DoubleGetter of(double value) {
		return new DoubleGetter(value);
	}
	
	public double get() { 
		return value; 
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
		DoubleGetter other = (DoubleGetter) object;
		
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value)) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "DoubleGetter [value= " + value + "]";
	}
}
