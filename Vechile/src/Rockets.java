
public class Rockets extends Vechiles {
	
	public Rockets(String VechName, int IdNumber, int speed) {
		super(VechName, IdNumber, speed);
		
	}

	private int circumference;

	public int getCircumference() {
		return circumference;
	}

	public void setCircumference(int circumference) {
		this.circumference = circumference;
	}

}
