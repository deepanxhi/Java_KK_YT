package arrays_kk;
import java.util.*;
public class largest_array {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		int largest=0;
		
		for(int i = 0; i<arr.length-1; i++)
		{
			if(arr[i]<arr[i+1])
			{
				arr[i]=arr[i+1];
			}
			largest=arr[i];
		}
		
		System.out.println(largest);*/
		
		//ARRAYLIST
		ArrayList <Integer> list = new ArrayList<Integer>();
		System.out.println("Enter elements (enter stop to exit )");
		
		while(true)
		{
			int num=sc.nextInt();
					if(num==-1)
					{
						break;
					}
					list.add(num);
		}
		
        int largest2=list.get(0);
		
		for(int i = 0; i<list.size()-1; i++)
		{
			if(largest2<list.get(i+1))
			{
				largest2=list.get(i+1);
			}
			
		}
		
		System.out.println(largest2);
		
		
	}
}
