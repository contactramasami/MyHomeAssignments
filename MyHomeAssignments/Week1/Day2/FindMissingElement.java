package Assignment_Week1day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) 
	{
		int num[]= {1,4,3,2,8,6,7};    
		Arrays.sort(num);
		int length=num.length;
		int max=num[length-1];
		for(int i=1;i<max;i++)
		{
			if(i!=num[i-1]) {
				System.out.println("First Missing Element Is: "+i);
				break;
				
			}
		}

	}

}
