package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tab = new int[5];
		int compteur = 0;
		int userChoice = 0;

		while (userChoice != 3) {
			userChoice = selectOption(sc);
			if (userChoice == 1) {
				compteur = enterInteger(sc, tab, compteur);
			} else if (userChoice == 2) {
				displayArray(tab);
			}
			if (compteur == tab.length) {
				tab = enlargeArray(tab);
			}
		}
		System.out.println("Programme terminé");
		sc.close();
	}

	private static int selectOption(Scanner sc) {
		System.out.println("Choisir une option :");
		System.out.println("1 - Ajouter un nombre au tableau");
		System.out.println("2 - Afficher les nombres existants");
		System.out.println("3 - Quitter le programme");
		return sc.nextInt();
	}

	private static int enterInteger(Scanner sc, int[] tab, int compteur) {
		System.out.println("Veuillez saisir un nombre entier :");
		tab[compteur] = sc.nextInt();
		compteur++;
		return compteur;
	}

	private static void displayArray(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

	private static int[] enlargeArray(int[] tab) {
		int[] newTab = new int[tab.length * 2];
		for (int i = 0; i < tab.length; i++) {
			newTab[i] = tab[i];
		}
		tab = newTab;
		return tab;
	}
}
