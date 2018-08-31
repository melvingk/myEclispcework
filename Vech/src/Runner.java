
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		
		Garage g1 = new Garage ();
		Car c1 = new Car ("Car", "C001", 4, 22 );
		Bike m1 = new Bike ("Motorcycle", "M001", 2, 7);
		Rocket r1 = new Rocket ("Rockets", "R001", 1000, false);
		
		g1.addToGarage(r1);
		g1.addToGarage(c1);
		g1.addToGarage(m1);
		
		g1.theVehicles();
		//System.out.println();
		g1.calculateBill();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Hi there!");

		String name = s.nextLine();
		System.out.println("What is the vehicle to remove?");
		String vech = s.next();
			if (name.equals("yes")) {
				System.out.println("Aight man, which vehicle?");
			}
			else if(name.equals("no"))
			{
			System.out.println("I thought so, lool");
			s.close();
			}
	
		
		
	}
}
