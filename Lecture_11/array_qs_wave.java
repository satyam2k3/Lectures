package Lecture_11;

public class array_qs_wave {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		horizontal_wave(arr);
//		vertical_wave(arr);
	}

	public static void horizontal_wave(int[][] arr) {
		for (int r = 0; r < arr.length; r++) {
			if (r % 2 != 0) {
				for (int c = arr[0].length - 1; c >= 0; c--) {
					System.out.print(arr[r][c] + " ");
				}
			} else {
				for (int c = 0; c < arr[0].length; c++) {
					System.out.print(arr[r][c] + " ");
				}
			}
//			System.out.println();
		}
	}

	public static void vertical_wave(int[][] arr) {
		for (int c = 0; c < arr[0].length; c++) {
			if (c % 2 != 0) {
				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.print(arr[r][c] + " ");
				}
			} else {
				for (int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c] + " ");
				}
			}
//			System.out.println();
		}
	}
}
