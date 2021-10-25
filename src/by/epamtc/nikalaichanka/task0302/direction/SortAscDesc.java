package by.epamtc.nikalaichanka.task0302.direction;

import by.epamtc.nikalaichanka.task0302.interfaces.SortDirection;

public class SortAscDesc {

	public static void massSwap(int[][] mass, int[] a, int[] b) {
		int[] tmp = a;
		a = b;
		b = tmp;
	}
}

class SortAscending implements SortDirection {
	public void sortDirection(int[][] mass, int[] x, int[] y, int a, int b) {
		if (a > b) {
			SortAscDesc.massSwap(mass, x, y);
		}
	}
}

class SortDescending implements SortDirection {
	public void sortDirection(int[][] mass, int[] x, int[] y, int a, int b) {
		if (a < b) {
			SortAscDesc.massSwap(mass, x, y);
		}
	}
}
