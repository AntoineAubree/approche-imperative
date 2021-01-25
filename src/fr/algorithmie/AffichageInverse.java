package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// display array elements in order
		System.out.println("array elements in order :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n-----------------------------------");

		// display array elements in inverse order
		System.out.println("array elements in inverse order :");
		for (int i = array.length - 1; i > -1; i--) {
			System.out.print(array[i] + " ");
		}
		
		// Copy array elements in arrayCopy
		int[] arrayCopy = new int [array.length];
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
		}
		
		System.out.println("\n-----------------------------------");
		
		// display arrayCopy elements in order
		System.out.println("arrayCopy elements in order :");
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i] + " ");
		}

	}

}
