package Lecture_16;

public class String_Builder_Demo {

	public static void main(String[] args) {
		String str = "abcd";
		StringBuilder sb = new StringBuilder(str);
		// this can be said as a flexible string like arraylist

		System.out.println(sb.charAt(2));

		sb.setCharAt(0, 'p');
		// changes charat 0 to p
		System.out.println(sb);

		sb.append(" nhi pta bhaiya");
		// adds the character at the last of the existing stringbuilder
		System.out.println(sb);
		
		sb.insert(1,"oly ");
		//it inserts oly at index shifts others 
		System.out.println(sb);
		
		String ans = sb.toString();
		//this converts stringbuilder to string
		System.out.println(ans);
	}

}
