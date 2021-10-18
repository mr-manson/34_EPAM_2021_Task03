package by.epamtc.nikalaichanka.task0301.logic;

public class BinarySearch {

	public static int binarySearch(int[] mass, int toSearch) {

		Sort.bubbleSort(mass);

		int start = 0;
		int end = mass.length - 1;

		while (start <= end) {
			int middle = (start + end) / 2;
			if (mass[middle] == toSearch) {
				return middle;
			} else if (mass[middle] < toSearch) {
				start = middle + 1;
			} else if (mass[middle] > toSearch) {
				end = middle - 1;
			}
		}
		return -1;
	}

}