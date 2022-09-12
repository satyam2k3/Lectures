package Lecture_12;

import java.util.Scanner;

public class String_Q {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String str = scn.next();
		String str = "lool";
//		System.out.println(isPalindrome(str));
		System.out.println(str.length());
		PalindromeSubString(str);
	}

	public static boolean isPalindrome(String str) {
		int s = 0;
		int end = str.length() - 1;
		while (end > s) {
			if (str.charAt(s) != str.charAt(end)) {
				return false;
			}
			s++;
			end--;
		}
		return true;
	}

	public static void PalindromeSubString(String str) {
//		int e = str.length();
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {// length-0
				String part = str.substring(s, e);
				if (isPalindrome(part) == true) {
					System.out.println(str.substring(s, e));
				}
			}
		}
	}

	public static boolean isPalin(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;

			}
			s++;
			e--;
		}
		return true;
	}

	public static void PalinSubString(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String part = str.substring(s, e);
				if (isPalin(part)) {
					System.out.println(str.substring(s, e));
				}
			}
		}
	}
}
