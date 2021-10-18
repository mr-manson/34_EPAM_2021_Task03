package by.epamtc.nikalaichanka.task0301.array;

import java.util.Arrays;

public class Array {
	
	private int[] array;
    private int length;

    public Array() {
    }

    public Array(int length) {
        int [] arr = new int[length];
    }

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		result = prime * result + length;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array other = (Array) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		if (length != other.length)
			return false;
		return true;
	}

 
}
