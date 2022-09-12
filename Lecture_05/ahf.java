package Lecture_05;

public class ahf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 378;
		int div = 2;
		while (num > 1) {
			if (num % div == 0) {
				System.out.println(div);
				num = num / div;
			} else {
				div++;
			}
		}
	}
}
