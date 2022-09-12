package Lecture_08;

public class array_swap {

	public static void main(String[] args) {
		// ARRAY SWAP
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 20, 12, 14, 7 };
		System.out.println(arr1[0] + " : " + arr2[0]);
//				swap(arr1[0], arr2[0]);
//				swap_a(arr1, arr2);
		swap_in(arr1, arr2, 0);
		System.out.println(arr1[0] + " : " + arr2[0]);
	}

//			public static void swap(int a, int b) {
//				int c = a;
//				a = b;
//				b = c;
//				System.out.println(a + " : " + b);
//			}

//			public static void swap_a(int[] a, int[] b) {
//				int[] c = a;
//				a = b;
//				b = c;
//				System.out.println(a[0] + " : " + b[0]);
	//
//			}

	public static void swap_in(int[] a, int[] b, int c) {
		int d = a[c];
		a[c] = b[c];
		b[c] = d;
		System.out.println(a[c] + " : " + b[c]);
	}

}
