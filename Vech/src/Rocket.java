
public class Rocket extends Vehicle 
{
	
	
	public Rocket (String type, String id, int fuel, boolean SeatBelts)
	{
		super (type, id, fuel);
		this.SeatBelts=SeatBelts;
		
	}
	
	
	private boolean SeatBelts;
	
	public boolean isSeatBelts() {
		return SeatBelts;
	}

	public void setSeatBelts(boolean seatBelts) {
		SeatBelts = seatBelts;
	}



}
