package helloWorld;
	//Print "Hello World" to console

import blueNoWaitYellow.BiscuitsToBoot;
import facility.Facility;
import headShouldersKnees.Feet;
import hello.Hello;
import sesameStreet.SesameStreet;
	//Import necessary classes

public class World {
	// Object oriented practice

	public static void main(String args[]) {
		Hello msg = new Hello();
		msg.hello();
			//Hello World
		
		System.out.println();

		Facility c = new Facility();
		c.evenMyFishKnowsThis();
			//Playing with char
		
		System.out.println();

		BiscuitsToBoot q = new BiscuitsToBoot();
		q.intoTheBin();
			//Gallons converted to liters
		
		System.out.println();

		SesameStreet s = new SesameStreet();
		s.oneHaHaHa();
			//Counting with the Count!
		
		System.out.println();
		
		Feet f = new Feet();
		f.baconFootball();
			//Converting centimeters into feet
	}
}