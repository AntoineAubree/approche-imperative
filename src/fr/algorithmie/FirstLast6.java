package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array = { 6, -9, 65, 98, 4, -98 };
		boolean arrayOk = false;

		// verify if array is ok
		if (array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6)) {
			arrayOk = true;
		}

		System.out.println("array is ok : " + arrayOk);
	}

}
