package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		int userNumber = enterInteger(1, 10);
		System.out.println("Votre nombre est : " + userNumber);
	}

	/**
	 * 
	 * @param minValue minimum value that the user is allowed to enter
	 * @param maxValue maximum value that the user is allowed to enter
	 * @return integer enter by user
	 */
	public static int enterInteger(int minValue, int maxValue) {
		Scanner sc = new Scanner(System.in);
		int userNumber = 0;
		while (userNumber < minValue || userNumber > maxValue) {
			System.out.println("Veuillez saisir un nombre compris entre " + minValue + " et " + maxValue + " :");
			userNumber = sc.nextInt();
		}
//		sc.close();
		return userNumber;
	}
	
	/**
	 * 
	 * @return integer enter by user
	 */
	public static int enterInteger() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre entier :");
		int userNumber = sc.nextInt();
//		sc.close();
		return userNumber;
	}

}
