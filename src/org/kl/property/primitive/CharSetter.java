package org.kl.property.primitive;

public final class CharSetter {
	private char value;
	
	public CharSetter(char value) {
		this.value = value;
	}
	
	public CharSetter of(char value) {
		return new CharSetter(value);
	}
	
	public void set(char value) {
		this.value = value;
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
