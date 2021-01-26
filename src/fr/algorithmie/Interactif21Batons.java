package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int newGame = 0;
		int gameMode = 0;
		int initialStick = 21;
		int currentStick = 21;
		int nbSticks = 0;

		while (newGame != 2) {
			currentStick = initialStick;
			gameMode = 0;
			newGame = 0;
			gameMode = selectGameMode(sc, gameMode);
			while (currentStick > 0) {
				// player start the game
				if (gameMode == 1) {
					displayGame(currentStick);
					currentStick = playerPlays(sc, currentStick, nbSticks);
					if (currentStick != 0) {
						displayGame(currentStick);
						currentStick = computerPlays(currentStick, nbSticks);
					}
				}
				// computer start the game
				else if (gameMode == 2) {
					displayGame(currentStick);
					currentStick = computerPlays(currentStick, nbSticks);
					if (currentStick != 0) {
						displayGame(currentStick);
						currentStick = playerPlays(sc, currentStick, nbSticks);
					}
				}
			}
			newGame = selectNewGame(sc, newGame);
		}
	}

	private static int selectNewGame(Scanner sc, int newGame) {
		while (newGame < 1 || newGame > 2) {
			System.out.println("Souaitez vous refaire une partie ?");
			System.out.println("1 - oui");
			System.out.println("2 - non");
			newGame = sc.nextInt();
		}
		return newGame;
	}

	private static int selectGameMode(Scanner sc, int gameMode) {
		while (gameMode < 1 || gameMode > 2) {
			System.out.println("Choisissez qui démarre la partie :");
			System.out.println("1 - Le joueur");
			System.out.println("2 - L'ordinateur");
			gameMode = sc.nextInt();
		}
		return gameMode;
	}

	private static int playerPlays(Scanner sc, int currentStick, int nbSticks) {
		if (currentStick == 1) {
			System.out.println("\nVous prenez le dernier bâton.");
			nbSticks = 1;
		} else if (currentStick == 2) {
			while (nbSticks < 1 || nbSticks > 2) {
				System.out.println("\nSélectionnez un nombre de bâtons entre 1 et 2.");
				nbSticks = sc.nextInt();
			}
		} else {
			while (nbSticks < 1 || nbSticks > 3) {
				System.out.println("\nSélectionnez un nombre de bâtons entre 1 et 3.");
				nbSticks = sc.nextInt();
			}
		}
		currentStick -= nbSticks;
		verifyIsFinish(currentStick, 1);
		return currentStick;
	}

	private static int computerPlays(int currentStick, int nbSticks) {
		if (currentStick == 1) {
			nbSticks = 1;
		} else if (currentStick == 2) {
			nbSticks = 1 + (int) (Math.random() * 2);
		} else {
			nbSticks = 1 + (int) (Math.random() * 3);
		}
		if (nbSticks > 1) {
			System.out.println("\nL'ordinateur enlève " + nbSticks + " bâtons.");
		} else {
			System.out.println("\nL'ordinateur enlève " + nbSticks + " bâton.");
		}
		currentStick -= nbSticks;
		verifyIsFinish(currentStick, 2);
		return currentStick;
	}

	private static void verifyIsFinish(int currentStick, int player) {
		if (currentStick == 0 && player == 1) {
			System.out.println("Vous avez perdu");
		} else if (currentStick == 0 && player == 2) {
			System.out.println("Félicitations, vous avez gagné");
		}

	}

	private static void displayGame(int currentStick) {
		System.out.println("Il reste actuellement " + currentStick + " bâtons.");
		for (int i = 0; i < currentStick; i++) {
			System.out.print(" | ");
		}
	}

}
