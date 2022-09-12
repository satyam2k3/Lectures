package Lecture_20;

public class Queen_Comb {
	public static void main(String[] args) {
//		combSeats(4, 2, "", 0);
//		combSeats2D(5, 4, 0, 0, "", 2);
		chess(3, 3, 0, 0, 2, "", new boolean[3][3]);
	}

	public static void combSeats(int total_box, int Qtp, String path, int curr) {
		if (Qtp == 0) {
			System.out.println(path);
			return;
		}
		if (curr == total_box) {
			return;
		}
		combSeats(total_box, Qtp - 1, path + 'Q' + curr, curr + 1);
		combSeats(total_box, Qtp, path, curr + 1);
	}

	public static void combSeats2D(int total_c, int total_r, int r, int c, String path, int Qtp) {
		if (Qtp == 0) {
			System.out.println(path);
			return;
		}
		if (c == total_c) {
			c = 0;
			r++;
		}
		if (r == total_r) {
			return;
		}
		combSeats2D(total_c, total_r, r, c + 1, path + "{" + r + "," + c + "}", Qtp - 1);
		combSeats2D(total_c, total_r, r, c + 1, path, Qtp);
	}

	public static void chess(int total_r, int total_c, int r, int c, int Qtp, String path, boolean[][] board) {
		if (Qtp == 0) { // +ve BC
			System.out.println(path);
			print(board);
			System.out.println("================");
			return;
		}
		if (c == total_c) {// moving logic!!
			c = 0;
			r++;
		}
		if (r == total_r) {// -ve bc
			return;
		}
		if (isSafe(board, r, c)) {
			board[r][c] = true;
			chess(total_r, total_c, r, c + 1, Qtp - 1, path + "Q{" + r + "," + c + "}", board);// Include

			board[r][c] = false;
		}
		chess(total_r, total_c, r, c + 1, Qtp, path, board);// Exclude
	}

	public static boolean isSafe(boolean[][] board, int r, int c) {
		// TODO Auto-generated method stub
//		uppar!!
		for (int R = 0; R < r; R++) {
			if (board[R][c]) {
				return false;
			}
		}
//		Left!!
		for (int C = 0; C < c; C++) {
			if (board[r][C]) {
				return false;
			}
		}
//		left Dia
		int R1 = r;
		int C1 = c;
		while (R1 >= 0 && C1 >= 0) {
			if (board[R1][C1]) {
				return false;
			}
			R1--;
			C1--;
		}
//		Right Dia
		int R2 = r;
		int C2 = c;
		while (R2 >= 0 && C2 < board[0].length) {
			if (board[R2][C2]) {
				return false;
			}
			R2--;
			C2++;
		}

		return true;
	}

	public static void print(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean b : row) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
