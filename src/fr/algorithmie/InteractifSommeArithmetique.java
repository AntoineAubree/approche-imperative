package fr.algorithmie;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		int userNumber = InteractifTantQue.enterInteger();
		int sumNumbers = 0;

		if (userNumber >= 0) {
			for (int i = 1; i <= userNumber; i++) {
				sumNumbers += i;
			}
		} else {
			for (int i = 1; i >= userNumber; i--) {
				sumNumbers += i;
			}
		}

		System.out.println("La somme de tous les entiers compris entre  1 et " + userNumber + " est : " + sumNumbers);
	}

}
