package by.epamtc.nikalaichanka.task0303.logic;

import by.epamtc.nikalaichanka.task0303.entity.Txt;

public class Logic {

	// 1
	public static Txt replaceKToChar(Txt txt, int k, char c) {
		for (int i = k; i < txt.getTxt().length(); i++) {
			txt.getTxt().replace(txt.getTxt().charAt(i), c);
		}
		return txt;
	}

	// 3
	public static Txt replacePaToPo(Txt txt) {
		if (txt.getTxt().contains("pa")) {
			txt.getTxt().replace("pa", "po");
		}
		return txt;
	}

}
