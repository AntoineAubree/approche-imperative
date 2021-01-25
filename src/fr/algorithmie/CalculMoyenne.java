package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// clacul of the array elements average
		int sumArrayElements = 0;
		float averageArrayElements = 0F;
		for (int i = 0; i < array.length; i++) {
			sumArrayElements += array[i];
		}
		averageArrayElements = (float) sumArrayElements / (float) array.length;
		System.out.println("the array elements average is : " + averageArrayElements);

	}

}
