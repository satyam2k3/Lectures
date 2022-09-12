package Lecture_04;

import java.util.Scanner;

public class rotate_a_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rot = sc.nextInt();
		int count = 0;
		int cpy = num;

		while (cpy > 0) {
			cpy = cpy / 10;
			count++;
		}
		rot = rot % count;
//		System.out.println(count);
//		System.out.println(rot);
		int n = 0;
		int ans = 0;

		while (n < rot) {
			int digit = num / (int) Math.pow(10, count - 1);
			int rem = num % (int) Math.pow(10, count - 1);
			num = rem * 10 + digit;
			n++;
		}
		System.out.println(num);

//		System.out.println(count);

	}

}
