
public class Bike extends Vehicle 
{

	
	public Bike (String type, String id, int fuel, int exhaustPower)
	{
		super (type, id, fuel);
		this.exhaustPower=exhaustPower;
	}
	
	
	private int exhaustPower;
	
	public int getExhaustPower() {
		return exhaustPower;
	}


	public void setExhaustPower(int exhaustPower) {
		this.exhaustPower = exhaustPower;
	}



	
	
	
	
	
	
	
	
	
	
}
