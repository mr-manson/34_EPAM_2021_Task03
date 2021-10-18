package by.epamtc.nikalaichanka.task0301.util;

public class RandomMassInit {

	public static void randomMassInit(int[] mass, int max) {
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * max);
		}
	}
}
