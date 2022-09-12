package Lecture_08;

public class Array_basic_Qs {
	public static void main(String[] args) {
		int[] arr = { 11, 12, 14, 0, 90, 8, 100 };
		System.out.println(max(arr));
	}

	public static int max(int[] arr) {
		int jeb = arr[0];
		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;

	}
}
