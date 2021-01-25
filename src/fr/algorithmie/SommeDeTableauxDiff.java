package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array01 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array02 = { -1, 12, 17, 14, 5, -9, 0, 18 };

		// create array with sum of array01 and array02
		int[] arraySum = new int[array01.length];
		for (int i = 0; i < arraySum.length; i++) {
			if (i < array02.length) {
				arraySum[i] = array01[i] + array02[i];
			} else {
				arraySum[i] = array01[i];
			}
		}

		// display arraySum elements
		System.out.println("arraySum elements :");
		for (int i = 0; i < arraySum.length; i++) {
			System.out.print(arraySum[i] + " ");
		}
	}

}
