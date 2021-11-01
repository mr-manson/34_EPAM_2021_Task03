package by.epamtc.nikalaichanka.task0301.logic;

public class ContainsThreeDifferentDigits {
	
	public static int containsThreeDifferentDigits(int[] mass) {
		int toSearch = 0;
		for(int i = 0; i < mass.length; i++) {
			if (isThreeDigitNumber(mass[i])) {
				int i1 = mass[i]/100;
				int i2 = (mass[i]/10)%10;
				int i3 = mass[i]%10;
				if(isThreeDifferentDigit(i1, i2, i3)){
					toSearch = i;
				}
			}
		}
		return mass[toSearch];
	}
	
	public static boolean isThreeDigitNumber(int a) {
		boolean b = false;
		if (a > 99 && a < 1000) {
			b = true;
		}
		return b;
	}
	
	public static boolean isThreeDifferentDigit(int a1, int a2, int a3) {
		boolean b = false;
		if (a1 != a2 && a1 != a3 && a2 != a3) {
			b = true;
		}
		return b;
	}
}
