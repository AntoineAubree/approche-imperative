package fr.algorithmie;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		int userNumber = InteractifTantQue.enterInteger();

		for (int i = 1; i < 11; i++) {
			System.out.print(userNumber + i + " ");
		}
	}

}
