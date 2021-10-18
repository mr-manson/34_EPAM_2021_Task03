package by.epamtc.nikalaichanka.task0301.logic;

public class FibonacciNumber {

	public static void main(String[] args) {

		System.out.println(isFibonacciNumber(7));
	}

	public static boolean isFibonacciNumber(int a) {
		boolean fib = false;
		int frst = 0;
		int scnd = 1;
		int summ = 0;

		do {
			summ = frst + scnd;
			frst = scnd;
			scnd = summ;
		} while (a - summ != 0 && a - summ >= 0);
		
		fib = true;

		return fib;
	}

}
