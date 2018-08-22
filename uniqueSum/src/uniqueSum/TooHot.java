package uniqueSum;

public class TooHot 

{ static boolean weather (int temperture, boolean IsSummer)
	{
	
	boolean check= false;
	
	if (temperture>=60 && temperture <=90) 
	{
		check = true;			
	}
	
	else if(temperture>=60 && temperture <=100 && IsSummer)
	{
		check = true;
	}
	return check;
	
	 
	
	
}



public static void main (String [] args)
{
	System.out.println(weather(92, false));

}
}