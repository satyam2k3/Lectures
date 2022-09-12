package Lecture_16;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PDI(5);

//		PID(1, 5);

//		PI(5);

//		int sp = fact(5);
//		System.out.println(sp);

		System.out.println(pow(2, 4));

//		System.out.println(Fibo(7));

	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		// BP: PI(n)
		// SP: PI(n-1)
		PI(n - 1);
		System.out.println(n);
	}

	public static void PID(int s, int e) {
		if (s > e) {
			return;
		}
		System.out.println(s);
		PID(s + 1, e);
		System.out.println(s);

	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
//		BP = fact n;
//		SP= fact n-1;
		return n * fact(n - 1);
	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		// BP: a^b
		// SP: a^(b-1)
		int sp = pow(a, b - 1);
		return sp * a;
	}

	public static int Fibo(int n) {
		if (n < 2) {
			return n;
		}
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}

}
