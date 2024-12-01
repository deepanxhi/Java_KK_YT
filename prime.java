package java_programming_classes;
import java.util.*;
public class prime {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to check");
		int num=sc.nextInt();
		int count = num_check(num);
		//if(count>1)
		//{
		//	System.out.println("Not a prime number");
		//	
		//}
		//else
		//{
			//System.out.println("Prime number");
		//}
		
	}
		
		static int num_check(int num)
		{
			int count=0;
		
		for(int i=1; i<=num/2; i++)
		{ 
			
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count>1)
		{
			System.out.println("Not a prime number");
			
		}
		else
		{
			System.out.println("Prime number");
		}
		
		return count;
}
}
		
	

