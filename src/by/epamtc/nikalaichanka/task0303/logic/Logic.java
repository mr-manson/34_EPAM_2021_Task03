package by.epamtc.nikalaichanka.task0303.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {

	// 1
	public static String replaceKToChar(String str, int k, String letterToChange) {

		StringBuilder sb = new StringBuilder(str);
		for (String word : str.split(" ")) {
			if (word.length() >= k) {
				StringBuilder checkWord = new StringBuilder(word);
				checkWord.replace(k, k + 1, letterToChange);
			}
			sb.append(word);
		}
		return sb.toString();
	}

	// 2
	public static String replacePaToPo(String str) {

		StringBuilder sb = new StringBuilder(str);
		Pattern pattern = Pattern.compile("pa");
		Matcher matcher = pattern.matcher(sb);
		return matcher.replaceAll("po");
	}

	// 3
	public static String replaceWord(String str, int length, String wordToChange) {

		StringBuilder sb = new StringBuilder(str);
		for (String word : str.split(" ")) {
			if (word.length() == length) {
				StringBuilder checkWord = new StringBuilder(word);
				checkWord.append(wordToChange);
			}
			sb.append(word);
		}
		return sb.toString();
	}

	// 4
	public static String deleteNonLettersExceptSpace(String str) {

		StringBuilder sb = new StringBuilder(str);
		Pattern pattern = Pattern.compile("[^a-zA-Z\\s]");
		Matcher matcher = pattern.matcher(sb);
		while (matcher.find()) {
			sb.deleteCharAt(sb.indexOf(matcher.group()));
		}
		return sb.toString();
	}
	
	// 5
	public static String deleteWordStartingConsonant(String str, int length) {

		StringBuilder sb = new StringBuilder(str);
		Pattern pattern = Pattern.compile("\\b[bcdfghjklmnpqrstvwxwzBCDFGHJKLMNPQRSTVWXWZ]\\w{" + (length - 1) + "}");
		Matcher matcher = pattern.matcher(sb);
		while (matcher.find()) {
		//	sb.deleteCharAt(sb.indexOf(matcher.group()));
		}
		return sb.toString();
	}
}
