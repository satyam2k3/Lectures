package Lecture_16;

public class String_demo {

	public static void main(String[] args) {
		String str = "lol";
		String str1 = "lol";
		String str2 = "lol";

		System.out.println(str == str1);
		// here it is comparing the address of the two

		String str00 = new String("lol");
		// here have initialized a new string at new address
		System.out.println(str == str00);
		// false cuz' don't have same address

		System.out.println(str.equals(str00));
		// this here compares the content inside the string

		str1 = "LLLLL";// no change of str at the original address
		System.out.println(str);
		System.out.println(str1);

		String s1 = "abcd";
		String s2 = s1.substring(0, 3);
		System.out.println(s1 == s2);
		//false cuz' new string is formed 
	}

}
