package by.epamtc.nikalaichanka.task0302.logic;

import by.epamtc.nikalaichanka.task0302.interfaces.*;

public class SortBySumm implements MassTransformer {
	public void massTransform(int[][] mass, SortDirection sd) {
		for (int i = 0; i < mass.length - 1; i++) {
			for (int j = 0; j < mass.length - i - 1; j++) {
				sd.sortDirection(mass, mass[j], mass[j + 1], massSum(mass[j]), massSum(mass[j + 1]));
			}
		}
	}

	private static int massSum(int[] mass) {
		int sum = 0;
		for (int i : mass) {
			sum += i;
		}
		return sum;
	}
}
