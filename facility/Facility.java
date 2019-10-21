package facility;
public class Facility {
	// Testing the char data type.
	
	char a;
	String b = "(";
	String c = //"     ";
	"\u00A0\u00A0\u00A0\u00A0\u00A0";
	String d = ")";
		// Establish variables for use in the class
	
	private void x() {System.out.print(b + a + d + (a - '0') + c);}
	
	public void evenMyFishKnowsThis() {
		System.out.println("----------------");
		
		System.out.println("#2 Playing with char");
		System.out.println();
		
		a=0;
		x();
		
		a++;
		x();

		a=(char) 2_147_483_647;
		x();
		
		a++;
		x();
		
		a= (char) 5496;	
		x();
		
		a=(char) -2_147_483_648;
		x();
		
		a--;
		x();
		
		a--;
		x();
		
		System.out.println();

		// char[] chArs;
		// chArs=new char[8];
		// chArs[0]=(char) 0;
		// chArs[1]=(char) 10_000;
		// chArs[2]=(char) 100_000_000;
		// chArs[3]=(char) 1_000_000_000;
		// chArs[4]=(char) 2_147_483_647;
		// chArs[5]=(char) -2_147_483_648;
		// chArs[6]=(char) -1_000_000_000;
		// chArs[7]=(char) -10_000;
			//Another way to create an array.

		char chArs[] = { (char) 65536, (char) 6079, (char) 7545, (char) 8383, (char) 6671, (char) 51884, (char) 48,
				(char) 65584 };

		for (char arrElement : chArs) {
			System.out.print(b + arrElement + d + (arrElement - '0') + c);}
		
		System.out.println();
		System.out.println();
		int i = Integer.MIN_VALUE;
		int n = Integer.MAX_VALUE;
		System.out.println("Integer minimum is " + i);
		System.out.println("Integer maximum is " + n);

		int chari = Character.MIN_VALUE;
		int charn = Character.MAX_VALUE;
		System.out.println("Character minimum is " + chari);
		System.out.println("Character maximum is " + charn);
		
		System.out.println("----------------");
	}
}