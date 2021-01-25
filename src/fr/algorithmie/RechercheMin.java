package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// search the smallest element
		int smallestElement = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallestElement) {
				smallestElement = array[i];
			}
		}
		System.out.println("the smallest element of array is : " + smallestElement);

	}

}
