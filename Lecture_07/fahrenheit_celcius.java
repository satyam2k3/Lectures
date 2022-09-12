package Lecture_07;

import java.util.Scanner;

public class fahrenheit_celcius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min_f = 0;
		int max_f = 100;
		int step = 20;
		for (int F = min_f; F <= max_f; F = F + step) {
			double C = (5 * (F - 32) / 9.0);
			System.out.println(F + "\t" + C);

		}
	}

}
