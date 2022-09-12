package Lecture_08;

public class Array_find {

	public static void main(String[] args) {
		int[] arr = { 11, 12, 14, 0, 90, 8, 100 };
		System.out.println(max(arr));
		System.out.println(find(arr, 8));
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

	public static int find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
//			int a = ali;
			if (i == ali) {
				return ali;
			}
		}

		return -1;
//		int a = 14;
//		for(int ali: arr) {
//			if(ali==a) {
//				return ali;
//			}
//		}
//		return -1;
	}

}
