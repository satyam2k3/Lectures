package Lecture_11;

import java.util.Scanner;

public class arr_2D_input {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();
		int[][] arr = new int[row][col];
//		System.out.println(arr[0].length);
//		System.out.println(arr.length);
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				arr[r][c] = scn.nextInt();
			}
		}
		for(int []r :arr) {
			for(int ali:r) {
				System.out.print(ali+" ");
			}
			System.out.println();
		}
	}

}
