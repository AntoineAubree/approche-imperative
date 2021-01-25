package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int stockLastValue = array[array.length - 1];

		// rotate array elements right
		for (int i = array.length - 1; i > -1; i--) {
			if (i > 0) {
				array[i] = array[i-1];
			}
			else if (i == 0) {
				array[i] = stockLastValue;
			}
		}

		// display new array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
