package org.kl.property.primitive;

public final class DoubleProperty {
	private double value;
	
	public DoubleProperty(double value) {
		this.value = value;
	}
	
	public DoubleProperty of(double value) {
		return new DoubleProperty(value);
	}
	
	public void set(double value) {
		this.value = value;
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
		
		DoubleProperty other = (DoubleProperty) object;
		
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value)) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "DoubleProperty [value= " + value + "]";
	}
}
