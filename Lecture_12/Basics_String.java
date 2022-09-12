package Lecture_12;

import java.util.Scanner;

public class Basics_String {

	public static void main(String[] args) {
		String str = "HELLO";
		System.out.println(str);// to print string

		System.out.println(str.length());// for length of string
		System.out.println(str.charAt(0));// prints the char at sabordinte charAt idx

		System.out.println(str.indexOf("E"));// to find the index of a char in string
		System.out.println(str.lastIndexOf("O"));// if present in the string gives the index
		System.out.println(str.lastIndexOf("+"));// if not present in the string prints -1

		System.out.println(str.startsWith("HELL"));// return true or false
		System.out.println(str.endsWith("O"));// these are case sensitive

		System.out.println("==================================");

		String str1 = "abcd";
		for (int s = 0; s < str1.length(); s++) {
			for (int e = s + 1; e <= str1.length(); e++) {
				System.out.println(str1.substring(s, e));
			}
		}

		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		System.out.println(a);
	}

}
