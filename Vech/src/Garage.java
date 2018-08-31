import java.util.ArrayList;

public class Garage {

	
	
	private ArrayList<Vehicle>billList= new ArrayList<Vehicle>();
			
		public  ArrayList<Vehicle> theVehicles()
		{
			return billList;
					
		}
	public int calculateBill()
	{
		int cost=0;			
		for (Vehicle List: billList)
		{
			if (List instanceof Car) {
			
				int Wheels=((Car) List).getNoOfWheels();
				cost = Wheels*200;
			System.out.println(cost);
			}
			else if (List instanceof Bike) {
				
				int exhaustPower=((Bike) List).getExhaustPower();
				cost = exhaustPower*150;
			System.out.println(cost);
			}
			else if (List instanceof Rocket) {
				
				if(((Rocket) List).isSeatBelts());
				cost =20000;
			System.out.println(cost);
			}
		}              
		return cost;
		
	}
	public void addToGarage(Vehicle vechile) {
		
		billList.add(vechile);
		
	}
	
	
	public void removeFromGarage(Vehicle vech) 
	
	{
		billList.remove(vech);
		System.out.println(vech.getFuelType() + " removed from garage");
		Car name = (Car)vech;
	}
	
	
	public void removeByName(String name) 
	{
		for (Vehicle v: billList)
		{
			if (name.equals(v))
			{
				billList.remove(v);
			}
		}
	}
}
