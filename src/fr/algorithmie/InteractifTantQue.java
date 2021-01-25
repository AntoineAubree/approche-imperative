package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		int userNumber = enterNumber(1, 10);
		System.out.println("Votre nombre est : " + userNumber);
	}

	/**
	 * 
	 * @param minValue minimum value that the user is allowed to enter
	 * @param maxValue maximum value that the user is allowed to enter
	 * @return integer enter by user
	 */
	protected static int enterNumber(int minValue, int maxValue) {
		int userNumber = 0;
		Scanner sc = new Scanner(System.in);
		while (userNumber < minValue || userNumber > maxValue) {
			System.out.println("Veuillez saisir un nombre compris entre 1 et 10 :");
			userNumber = sc.nextInt();
		}
		sc.close();
		return userNumber;
	}

}
