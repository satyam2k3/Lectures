package Lecture_15;

public class Dhoka {

	public static void main(String[] args) {
		int n = 100000;
		long start = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < n; i++) {
			str = str + i;
//			int LL = i+i-3*2;
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0);
	}

}
