package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// copy array elements in arrayCopy in inverse order
		int[] arrayCopy = new int[array.length];
		for (int i = 0; i < arrayCopy.length; i++) {
			arrayCopy[i] = array[arrayCopy.length - 1 - i];
		}

		// display array elements in order
		System.out.println("array elements in order :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\n-----------------------------------");
		
		// display arrayCopy elements in order
		System.out.println("arrayCopy elements in order :");
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i] + " ");
		}
	}

}
