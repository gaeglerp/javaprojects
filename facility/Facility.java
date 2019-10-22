package facility;

public class Facility {

	char a;
	private static String b = "(";
	private static String c = ")";
	private static String d = "     ";

	private char x(char a) {

		System.out.print(b + a + c + (int) a + d);
		return a;

	}

	public void evenMyFishKnowsThis() {

		System.out.println("----------------"
				+ "\n#2 Playing with char\n");

		x((char) 0);
		
		a--;

		x(a);

		x((char) 2_147_483_647);

		a++;
		
		x(a);

		x((char) 5496);

		x((char) -2_147_483_648);

		a--;
		
		x(a);

		System.out.println();

		char chArs[] = {(char) 6079, (char) 7545, (char) 8383, (char) 6671,
				(char) 51884, (char) 48, (char) 65584};

		for (char arrElement : chArs) {

			System.out.print(b + arrElement + c + (int) arrElement + d);

		}

		System.out.println("\nInteger minimum is " + Integer.MIN_VALUE
				+ "\nInteger maximum is " + Integer.MAX_VALUE + "\nCharacter minimum is " + (int) Character.MIN_VALUE
				+ "\nCharacter maximum is " + (int) Character.MAX_VALUE + "\n----------------");

	}

}