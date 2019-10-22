package blueNoWaitYellow;

public class BiscuitsToBoot {
	
	public void intoTheBin() {
		System.out.println("----------------"
				+ "\n#3 Converting gallons into liters\n");
		
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