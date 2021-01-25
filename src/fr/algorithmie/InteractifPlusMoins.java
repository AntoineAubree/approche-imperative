package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomNumber = 1 + (int) (Math.random() * ((100 - 1) + 1));
		int userNumber = 0;
		int compteur = 0;

		do {
			System.out.println("Veuillez saisir un nombre : ");
			userNumber = sc.nextInt();
			compteur++;
			if (userNumber == randomNumber) {
				System.out.println("Félicitations, vous avez trouvé le nombre aléatoire qui est : " + randomNumber);
				System.out.println("Vous avez mis " + compteur + " tentatives.");
			} else if (userNumber > randomNumber) {
				System.out.println("Vous êtes au dessus du nombre aléatoire.");
			} else {
				System.out.println("Vous êtes au dessous du nombre aléatoire.");
			}
		} while (userNumber != randomNumber);
	}

}
