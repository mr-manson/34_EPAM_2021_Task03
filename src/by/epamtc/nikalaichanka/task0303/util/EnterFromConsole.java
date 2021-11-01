package by.epamtc.nikalaichanka.task0303.util;

import java.util.Scanner;
import by.epamtc.nikalaichanka.task0303.entity.Txt;

public class EnterFromConsole {

	public static Txt enterFromConsole(Txt txt) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (!s.hasNextLine()) {
			s.nextLine();
		}
		String str = s.nextLine();
		String addTxt = txt.getTxt() + str;
		txt.setTxt(addTxt);

		return txt;
	}
}
