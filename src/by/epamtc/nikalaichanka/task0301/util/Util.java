package by.epamtc.nikalaichanka.task0301.util;

import by.epamtc.nikalaichanka.task0301.logic.PrimeNumber;

public class Util {

	public static void massPrint(int[] mass) {
		for (int i : mass) {
			System.out.print(i);
		}
	}
	
	public static void primeNumberPrint(int [] mass) {
		for(int ind : mass) {
			if(PrimeNumber.isPrimeNumber(mass[ind])) {
				System.out.print(mass[ind] + " ");
			}
		}
	}
}
