
public class Car extends Vehicle 
{

	public Car (String type, String id, int fuel,int NoOfWheels)
	{
		super (type, id, fuel);
		this.NoOfWheels=NoOfWheels;
		
	}


	private int NoOfWheels;
	
	public int getNoOfWheels() {
		return NoOfWheels;
	}


	public void setNoOfWheels(int noOfWheels) {
		NoOfWheels = noOfWheels;
	}


	
	
	
}
