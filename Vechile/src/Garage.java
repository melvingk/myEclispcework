import java.util.ArrayList;

public class Garage
{
	
	String name;
	
	ArrayList<Vechiles>billList= new ArrayList<>();
	
	public Garage(String name)
	{
		this.name = name;
				
	}
	
	Vechiles c1= new Vechiles("car");
	Vechiles m1= new Vechiles("Motorcycle");
	Vechiles r1= new Vechiles("Rocket");
	
	{
		
	billList.add(c1);
	billList.add(m1);
	billList.add(r1);

	}
	
	
	
	
	}
