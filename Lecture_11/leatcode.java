package Lecture_11;

import java.util.Arrays;

public class leatcode {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int []a = twoSum(nums, 9);
		System.out.println(Arrays.toString(a));
		
//		disp(ans);
	}

	public static void disp(int[] ans) {
		for (int ali : ans) {
			System.out.println(ali);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int sum = 0;
		int[] ans = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				sum = nums[i] + nums[j];
				if (sum == target) {
					ans[0] = i;
					ans[1] = j;
				}
			}
		}
		return ans;
	}
}
