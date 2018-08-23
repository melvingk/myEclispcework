
public class Vechiles {

	private String Name;
	private int IdNumber;
	private int speed;

	public Vechiles(String VechName) 
	{
		this.Name=VechName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(int idNumber) {
		IdNumber = idNumber;
	}

}
