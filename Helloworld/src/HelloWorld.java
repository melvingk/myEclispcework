
public class HelloWorld 
{
	

	public static void main (String[] args) 
	
	{
       
		//arrays
		int [] num = new int [10];
				
		for  (int b=0; b<num.length; b++)
		{
			num [b]=b+1;
			System.out.println(num[b]);
			
			num [b]=b*10;
			System.out.println(num[b]);
			
		}
		
		
	//System.out.println((Result (x,y)));
	}
	
	//condition where if one value is zero, prints the other value
	static int numbers ( int a, int b)
	{ 
		int c=0;
		
		if (a==0 && b!=0)
		{
			c=b;
		}
		else if (b==0 && a!=0)
		{
			c=a;
		}	
		return c;
	}
	//condition to have addition and if not multiplication 
	static int Result ( int a, int b) 
	{
		int result=0;
		
		if (a<10 && b>0)
		{
			result=a+b;
		}
		else
		{	
			result=a*b;	
			
		}
		
		return result;
		
	}
}



