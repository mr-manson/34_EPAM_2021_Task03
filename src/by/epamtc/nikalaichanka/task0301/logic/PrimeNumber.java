package by.epamtc.nikalaichanka.task0301.logic;

public class PrimeNumber {
	
	public static boolean isPrimeNumber (int a) {
		boolean prime = false;
		int count = 0;
		
		for (int i = 1; i <= a; i++) {
			if (a%i == 0) {
				count++;
			}
		}
		if (count == 2) {
			prime = true;
		}
		return prime;
	}
}
