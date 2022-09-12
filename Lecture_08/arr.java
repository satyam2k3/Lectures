package Lecture_08;

public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 2 * (i + 1);
		}
		System.out.println("======");
		for (int ali : arr) {
			System.out.println(ali);
		}
		
	}

}
