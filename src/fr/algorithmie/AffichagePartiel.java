package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// display array elements greater than 3
		System.out.println("array elements greater than 3 :");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println("\n-----------------------------------");

		// display even array elements
		System.out.println("even array elements :");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println("\n-----------------------------------");

		// display array elements with even index
		System.out.println("array elements with even index :");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println("\n-----------------------------------");

		// display odd array elements
		System.out.println("odd array elements :");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
