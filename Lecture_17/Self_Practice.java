package Lecture_17;

public class Self_Practice {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] arr1 = {  };
//		PI(4);
//		PID(1, 4);
//		System.out.println(POW(2, 4));
		Print(arr, 0);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PI(n - 1);
	}

	public static void PID(int s, int e) {
		if (e < s) {
			return;
		}
		System.out.println(s);
		PID(s + 1, e);
		System.out.println(s);
	}

	public static int POW(int a, int b) {
		if (b == 0) {
			return 1;
		}
		int s = POW(a, b - 1);
		return a * s;
	}

	public static void Print(int[] arr, int s) {
		if (s == arr.length) {
			return;
		}
//		bp = print(arr[s], s)
//		sp = print(arr[s], s+1)
		System.out.println(arr[s]);
		Print(arr, s + 1);
	}
	public static void 
}
