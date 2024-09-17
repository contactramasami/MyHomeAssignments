package Assignment_Week1day2;

public class IsPrimeNumber 
{

	public static void main(String[] args) 
	{
		int num,i,remainder;
		num=13;
		boolean prime= true;;
				
		for(i=2; i<=num-1;i++)
		{
			remainder=num%i;
			if (remainder==0)
					prime= false;
			
			
		}
		if (prime)
			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " is Not A Prime Number");
		
	}

}
