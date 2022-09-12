package Lecture_15;

public class Dhoka_2 {

	public static void main(String[] args) {
		String str1 = "LOL";
		String str21 = str1;
		String str22 = str1;
		String str23 = str1;

		System.out.println(str1 == str23);
		str22 = str23 + 'I';
		System.out.println(str1 + "," + str22);
		System.out.println(str1 == str22);
	}

}
