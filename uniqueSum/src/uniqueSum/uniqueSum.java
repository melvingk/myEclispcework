package uniqueSum;

public class uniqueSum {
	
	static int addition (int a,int b, int c)
	{ 
		
		
	int sum;
	sum =a+b+c;
	
	if (a==b && a==c)
	{
		
		 sum=0;
	}
	
	else if (b==c )
	{
		 sum=a;
	}
	
	else if (c==a)
	{
		
		 sum=b;
	}
	else if (a==b)
	{
		 sum=c;
	}
	return sum;
	}
	 
			
public static void main (String [] args) 
	
{

	System.out.println(addition (2,3,2));
	
}
}
