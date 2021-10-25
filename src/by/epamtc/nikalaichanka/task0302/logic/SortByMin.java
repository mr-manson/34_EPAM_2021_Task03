package by.epamtc.nikalaichanka.task0302.logic;

import by.epamtc.nikalaichanka.task0302.interfaces.*;

public class SortByMin implements MassTransformer {
	public void massTransform(int[][] mass, SortDirection sd) {
		for (int i = 0; i < mass.length - 1; i++) {
			for (int j = 0; j < mass.length - i - 1; j++) {
				sd.sortDirection(mass, mass[j], mass[j + 1], massMin(mass[j]), massMin(mass[j + 1]));
			}
		}
	}

	private static int massMin(int[] mass) {
		int min = mass[0];
		for (int i = 0; i < mass.length; i++) {
			if (min > mass[i]) {
				min = mass[i];
			}
		}
		return min;
	}
}
