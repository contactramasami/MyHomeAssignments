package Assignment_Week1day2;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		int Terms = 10;
		int Num1 = 0;
		int Num2 = 1;
		System.out.println("Fibonacci Series:");
		for (int i = 0; i < Terms; i++) 
		{
			System.out.println(Num1);
			int nextNum = Num1 + Num2;
			Num1 = Num2;
			Num2 = nextNum;
		}

	}

}
