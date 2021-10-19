package by.epamtc.nikalaichanka.task0302.logic;

public class BubbleSort {
	
	// ?????
	
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
	
	private static void swap(int[] mass, int frst, int scnd) {
		int temp = mass[frst];
		mass[frst] = mass[scnd];
		mass[scnd] = temp;
	}
}
