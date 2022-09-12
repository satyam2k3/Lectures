package Lecture_18;

public class Recursion {

	public static void main(String[] args) {
//		Substring("ABC", "");
//		cointoss(3, "");
//		stairs(0, "");
//		Perm(4, 2, "", new boolean[4]);
		Partitioning("nitin", "");
	}

	public static void Substring(String players, String team) {
		if (players.isEmpty()) {
			System.out.println(team);
			return;
		}
		char ch = players.charAt(0);
		Substring(players.substring(1), team + ch);
		Substring(players.substring(1), team);
	}

	public static void cointoss(int n, String toss) {
		if (n == 0) {
			System.out.println(toss);
			return;
		}
		cointoss(n - 1, toss + 'H');
		cointoss(n - 1, toss + 'T');
	}

	public static void stairs(int curr, String path) {
		if (curr == 4) {
			System.out.println(path);
			return;
		} else if (curr > 4) {
			return;
		}
		stairs(curr + 1, path + '1');
		stairs(curr + 2, path + '2');
	}

	public static void Perm(int total, int Qtp, String path, boolean[] seats) {

		if (Qtp == 0) {
			System.out.println(path);
			return;
		}

		for (int box = 0; box < total; box++) {
			if (seats[box] == false) { // seat is empty!!
				seats[box] = true;// prep!!
				Perm(total, Qtp - 1, path + "Q" + box, seats);
				seats[box] = false;// explicit back tracking!!
				// undo karo prep ko!!
			}
		}
	}

	public static void Partitioning(String table, String bag) {
		if (table.isEmpty()) {
			System.out.println(bag);
		}
//		table = "nitin"
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			if (isPalin(piece)) {
				String remain = table.substring(chakku);
				// System.out.println(piece + "--" + remain);
				Partitioning(remain, bag + "||" + piece);
			} 
		}

	}

	private static boolean isPalin(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		// TODO Auto-generated method stub
		return true;
	}
}
