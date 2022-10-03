package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] matrise = { { 1, 2, 3 }, { 4, 5, 6 } };
		skrivUt(matrise);
	}

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] rekke : matrise) {
			for (int tall : rekke) {
				System.out.print(tall + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String a = "";
		for (int[] rekke : matrise) {
			for (int kolonne : rekke) {
				a += (kolonne + " ");
			}
			a += "\n";
		}
		return a;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = matrise.clone();

		for (int i = 0; i < nyMatrise.length; i++) {
			int[] rad = nyMatrise[i];
			for (int j = 0; j < rad.length; j++) {
				rad[j] = rad[j] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;

	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {

			int i2 = 0;

			for (int y = 0; y < matrise[0].length; y++) {
				nyMatrise[i][i2] = matrise[y][i];

				i2++;
			}
		}

		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
