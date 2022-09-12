package Lecture_08;

import java.util.Scanner;

public class array_input {

	public static void main(String[] args) {
		//ARRAY INPUT
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int idx = 0; idx < n; idx++) {
			arr[idx] = sc.nextInt();
		}//for each loop
		for (int ali : arr) {
			System.out.print(ali + " ");
		}

	}

}
