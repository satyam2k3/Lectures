package Lecture_11;

public class array_basic {

	public static void main(String[] args) {
		int[][] mat = new int[3][4];
//		System.out.println(mat);// ----->prints the address of the array
//										[[I@515f550a in this [[ this rep. 2D array
//		System.out.println(mat.length);// tells no. of rows
//		System.out.println(mat[0].length);// gives the no. of column
//		System.out.println(mat[1000].length);
//		for (int r = 0; r < mat.length; r++) {
////			int[] row = mat[r];
////			System.out.print(r + " ");
//			for (int c = 0; c < mat[0].length; c++) {
////				int[] col = mat[c];
//				System.out.print(mat[r][c] + " ");
//			}
//			System.out.println();
//		}
		int ct = 0;
		for (int r = 0; r < mat.length; r++) {
			int[] row = mat[r];
			for (int c = 0; c < mat[0].length; c++) {
//				int[] col = mat[c];
//				System.out.print(mat[r][c] + " ");
				mat[r][c] = ct;
				ct++;
			}
//			System.out.println();
		}
		for(int[] row :mat) {
//			System.out.println(row[3]);
			for(int ali:row) {
				System.out.print(ali+" ");
			}
			System.out.println();
		}
	}

}
