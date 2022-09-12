package Lecture_02;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int i = 0;
		while (i < n) {
			int c = a + b;
//			System.out.println(a);
			a = b;
			b = c;
			i++;

		}
		System.out.println(a);
//		it prints the fourth fibonacci number 
//		and the fibonacci number starts form 0 i.e.- 0th 1st 2nd 3rd 4th 5th 
//                                                   0	 1   1   2   3   5  
	}

}
