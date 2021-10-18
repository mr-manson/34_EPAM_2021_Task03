package by.epamtc.nikalaichanka.task0301.logic;

public class MinMax {

	public static int minFromMass(int[] mass) {
		int min = mass[0];

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] < min)
				min = mass[i];
		}
		return min;
	}

	public static int maxFromMass(int[] mass) {
		int max = mass[0];

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > max)
				max = mass[i];
		}
		return max;
	}

}
