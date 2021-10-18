package by.epamtc.nikalaichanka.task0301.logic;

public class Sort {

	private static void swap(int[] mass, int frst, int scnd) {
		int temp = mass[frst];
		mass[frst] = mass[scnd];
		mass[scnd] = temp;
	}

	public static int[] bubbleSort(int[] mass) {
		for (int i = 0; i < mass.length - 1; i++) {
			for (int j = (mass.length - 1); j >= (i + 1); j--) {
				if (mass[j] < mass[j - 1]) {
					swap(mass, j, j - 1);
				}
			}
		}
		return mass;
	}

	public static int[] selectionSort(int[] mass) {
		for (int left = 0; left < mass.length; left++) {
			int minInd = left;
			for (int i = left; i < mass.length; i++) {
				if (mass[i] < mass[minInd]) {
					minInd = i;
				}
			}
			swap(mass, left, minInd);
		}

		return mass;
	}

	public static int[] insertionSort(int[] mass) {
		for (int left = 0; left < mass.length; left++) {
			int value = mass[left];
			int i = left - 1;
			for (; i >= 0; i--) {
				if (value < mass[i]) {
					mass[i + 1] = mass[i];
				} else {
					break;
				}
			}
			mass[i + 1] = value;
		}
		return mass;
	}
}
