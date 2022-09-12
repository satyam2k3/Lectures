package Lecture_11;

import java.util.Arrays;

public class All_Sorting {

	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10 };
		int[] arr1 = { 10, 20, 30, 40, 1 };
//		bubble(arr);
//		selection(arr);
//		insertion(arr);
		insertion_Sort(arr);
//		insertion_sort(arr);
	}

	public static void bubble(int[] arr) {
		for (int count = 0; count < arr.length; count++) {
			for (int s = 0; s < arr.length - 1 - count; s++) {
				if (arr[s + 1] < arr[s]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("============");
		}
	}

	public static void selection(int[] arr) {
		for (int last = arr.length - 1; last > 0; last--) {
			int maxI = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[maxI] < arr[i]) {
					maxI = i;
				}
			}
			int temp = arr[last];
			arr[last] = arr[maxI];
			arr[maxI] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void insertion(int[] arr) {
		int last = arr.length - 1;
		int idx = last - 1;
		int ali = arr[last];
		int count = 0;
		while (idx >= 0 && arr[idx] > ali) {
			arr[idx + 1] = arr[idx];
			idx--;
			count++;
		}
		System.out.println(count);
		arr[last - count] = ali;
		System.out.println(Arrays.toString(arr));
	}

	public static void insertion_Sort(int[] arr) {// by self

		for (int last = 1; last < arr.length; last++) {
			int ali = arr[last];
			int idx = last - 1;
			int count = 0;
			while (idx >= 0 && arr[idx] > ali) {
				System.out.println(Arrays.toString(arr));
				arr[idx + 1] = arr[idx];
				idx--;
				count++;
				System.out.println("-" + Arrays.toString(arr));
			}
//			System.out.println(count);
			arr[last - count] = ali;
			System.out.println("---" + Arrays.toString(arr));
		}
	}

//	public static void insertion_sort(int[] arr) {// by sir
//		for (int last = 1; last < arr.length; last++) {
//			int idx = last - 1;
//			int ali = arr[last];
////		while(arr[idx]>ali&&idx>=0) {
//
//			while (idx >= 0 && arr[idx] > ali) {
//				arr[idx + 1] = arr[idx];
//				idx--;
//				System.out.println(Arrays.toString(arr));
//			}
//			arr[idx + 1] = ali;
//			System.out.println("---" + Arrays.toString(arr));
//			System.out.println("============");
//		}
//	}
}
