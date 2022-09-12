package Lecture_02;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int div = 1;
		int count = 0;
//		System.out.println("The factors are;");
		while (div <= num) {
			if (num % div == 0) {
				count++;
//				System.out.println(div);
			}
			div++;
		}
		if(count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}

	}

}
