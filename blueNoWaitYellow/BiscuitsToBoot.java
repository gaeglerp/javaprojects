package blueNoWaitYellow;
public class BiscuitsToBoot {

	
	public void intoTheBin() {
		System.out.println("----------------");

		System.out.println("#3 Converting gallons into liters");
		System.out.println();
		
		double gallons;
		double liters;
		double d;

		for (gallons = 1;
			gallons <= 5;
			gallons++) {
				liters = (gallons * 3.7854);
				d = (Math.floor(liters * 100)) / 100d;
				System.out.println(
				gallons +
				" gallon(s) is " +
				d +
				" liters");}
		
		System.out.println("----------------");
	}
}