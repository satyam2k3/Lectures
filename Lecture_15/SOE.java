package Lecture_15;

public class SOE {

	public static void main(String[] args) {
		int n = 1000;
		SOE_logic(n);
	}

	public static void SOE_logic(int n) {
		boolean[] isComp = new boolean[n + 1];
		isComp[0] = true;
		isComp[1] = true;
		for (int div = 2; div * div <= n; div++) {
			if (!isComp[div]) {
				for (int table = div * div; table <= n; table = table + div) {
					isComp[table] = true;
				}
			}
		}
		for (int num = 2; num <= n; num++) {
			if (isComp[num] == false) {
				System.out.println(num);
			}
		}
	}

}
