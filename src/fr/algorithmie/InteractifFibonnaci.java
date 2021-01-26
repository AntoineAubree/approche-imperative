package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int userNumber = 0;
		// Concidérons que la première valeur de la suite de Fibonnaci se trouve au rang
		// 1 et non au rang 0
		while (userNumber < 1) {
			System.out.println("Veuillez saisir un entier suppérieur ou égal à 1 :");
			userNumber = sc.nextInt();
		}
		int previousValue = 0;
		int fibonnaciValue = 0;
		int fibonnaciValueStock = 0;
		sc.close();

		for (int i = 1; i < userNumber; i++) {
			if (i == 1) {
				fibonnaciValue = 1;
				fibonnaciValueStock = fibonnaciValue;
			} else if (i > 1) {
				fibonnaciValue += previousValue;
				previousValue = fibonnaciValueStock;
				fibonnaciValueStock = fibonnaciValue;
			}
		}

		System.out.println("Le nombre de Fibonnaci de rang N est : " + fibonnaciValue);

	}

}
