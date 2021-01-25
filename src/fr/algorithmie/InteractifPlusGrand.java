package fr.algorithmie;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		int maxNumber = 0;
		int userNumber = 0;

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				maxNumber = InteractifTantQue.enterInteger();
			} else {
				userNumber = InteractifTantQue.enterInteger();
				if (userNumber > maxNumber) {
					maxNumber = userNumber;
				}
			}
		}

		System.out.println("the greatest number enter by tge user is : " + maxNumber);
	}

}
