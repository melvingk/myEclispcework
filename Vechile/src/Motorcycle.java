
public class Motorcycle extends Vechiles

{
	public Motorcycle (String type, String id, int fuel)
	{
		super (type, id, fuel);
	}


	private int gunExhaust;

	public int getGunExhaust() {
		return gunExhaust;
	}

	public void setGunExhaust(int gunExhaust) {
		this.gunExhaust = gunExhaust;
	}
}
