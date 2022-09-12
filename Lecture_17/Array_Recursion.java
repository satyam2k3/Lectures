package Lecture_17;

public class Array_Recursion {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		Print(arr, 0);
//		Rev_Prt1(arr, arr.length - 1);
		Rev_prt2(arr, 0);
	}

	public static void Print(int[] arr, int s) {
		if (s == arr.length) {
			return;
		}
		// BP: Print (arr,s)---here s is telling the index of the given arr
		// SP: Print (arr,s+1)
		System.out.println(arr[s]);
		Print(arr, s + 1);
	}

	public static void Rev_Prt1(int[] arr, int s) {// my method
		if (s < 0) {
			return;
		}
		// BP: Print (arr, arr.length-1)
		// SP: print ((arr, arr.length-1)-1)
		System.out.println(arr[s]);
		Rev_Prt1(arr, s - 1);
	}

	public static void Rev_prt2(int[] arr, int s) {

		if (s == arr.length) {
			return;
		}
		// BP: Rev (arr, s)
		// SP: Rev ((arr, s+1)
		Rev_prt2(arr, s + 1);
		System.out.println(arr[s]);
	}

	public static int max(int [] arr, int s) {
		
		//BP: max(arr,s)
		// SP:max(arr,s+1)
		max(arr,s+1);
		return 
				
				
				
				
		
	}

}
