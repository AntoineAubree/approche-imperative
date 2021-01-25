package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userNumber = 0;
		while (userNumber < 1 || userNumber > 10) {
			System.out.println("Veuillez saisir un nombre compris entre 1 et 10 :");
			userNumber = sc.nextInt();
		}
		System.out.println("Votre nombre est : " + userNumber);
		sc.close();
	}

}
