
public class Vehicle 
{


	private String Type;
	private String Id;
	private int fuelType;
	
	
	public Vehicle (String Type, String id, int fuel)
	
	{
		this.setFuelType(fuel);
		this.setType(Type);
		this.setId(id);
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public int getFuelType() {
		return fuelType;
	}


	public void setFuelType(int fuelType) {
		this.fuelType = fuelType;
	}
	
}
