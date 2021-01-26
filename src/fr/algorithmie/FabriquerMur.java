package fr.algorithmie;

public class FabriquerMur {

	public static void main(String[] args) {
		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}

	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		System.out.println(fabriquerMur(nbSmall, nbBig, longueur));
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}

	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		int sizeSmall = 1;
		int sizeBig = 5;

		boolean resultat = false;
		for (int i = 0; i <= nbBig; i++) {
			for (int j = 0; j <= nbSmall; j++) {
				if (i < nbBig && j == sizeBig -1) {
					break;
				} else if (i * sizeBig + j * sizeSmall == longueur) {
					resultat = true;
				}
			}
		}
		return resultat;
	}

}
