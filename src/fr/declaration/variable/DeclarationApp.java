package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		byte myByte01 = 15;
		short myShort01 = 230;
		int myInt01 = 59_874;
		long myLong01 = 5_000_000_000L;
		float myFloat01 = 562.53F;
		double myDouble01 = 589_456_123_781_489.47D;
		char myChar01 = 'c';
		boolean myBoolean01 = true;
		String myString01 = "Je suis un string!!";

		System.out.println(myByte01);
		System.out.println(myShort01);
		System.out.println(myInt01);
		System.out.println(myLong01);
		System.out.println(myFloat01);
		System.out.println(myDouble01);
		System.out.println(myChar01);
		System.out.println(myBoolean01);
		System.out.println(myString01);

		String randomString = "Voici le résultat d’un calcul : 1+5=6";
		System.out.println(randomString);
		randomString = "Voici le résultat d’un calcul :\n1+5=6";
		System.out.println(randomString);
	}

}
