package fr.algorithmie;

public class InteractifTableMult {

	public static void main(String[] args) {
		int userNumber = InteractifTantQue.enterInteger(1, 10);

		// display multiplication table of userNumber
		for (int i = 1; i < 11; i++) {
			System.out.println(userNumber + " * " + i + " = " + userNumber * i);
		}
	}

}
