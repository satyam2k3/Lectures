package Lecture_08;

//import java.util.Scanner;

public class array_demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);// shows the memory address of the array
		System.out.println(arr.length);// shows the length of the array

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		System.out.println(arr[arr.length - 1]);

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
	
}
