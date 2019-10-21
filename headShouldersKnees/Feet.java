package headShouldersKnees;

public class Feet {

	public void baconFootball() {
		System.out.println("----------------");
		
		System.out.println("#5 Converting Centimeters into Feet");
		System.out.println();
		
		int cm;
		double feet;
		int count = 0;
		
		for(cm=1;cm<=10;cm++){
			feet=(cm/30.48);
			System.out.println(cm + " centimeter(s) = " + (Math.floor(feet * 1000)) / 1000d +" feet");
		
			count++;

			if(count==7){
				System.out.println();
				System.out.println("Lucky number 7!");
				System.out.println();
				count=0;}
		}
		
		System.out.println("----------------");
	}

}
