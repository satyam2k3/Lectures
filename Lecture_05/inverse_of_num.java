package Lecture_05;

public class inverse_of_num {

	public static void main(String[] args) {
		int num= 23145;
		int pos = 1;
		while(num>0) {
			int digit = num % 10;
			num= num /10;
			System.out.println(digit + " " + pos);
			pos++;
			int n = pos * (int)Math.pow(10,digit-1);
			System.out.println(n);
			
			
		}
		
	}

}
  