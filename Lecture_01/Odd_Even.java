package Lecture_01;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
//		int num = 90;
//		int rem = num % 2;
//		if (0 + 1 == rem + 1) {
//			System.out.println("EVEN");
//
//		} else {
//			System.out.println("ODD");
//		}
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int rem = num % 2;
		if (0 + 1 == rem + 1) {
			System.out.println("EVEN");

		} else {
			System.out.println("ODD");
		}

	}

}
