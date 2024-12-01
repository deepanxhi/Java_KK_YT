package java_programming_classes;
import java.util.*;
public class varargs {
	public static void main(String args[])
	{
		fun(1,2,3,4,5,6,7);
		multiple(2,3,"kunal","rahul","mona");
		
	}
	
	static void demo(int ...v)
	{
		System.out.println(Arrays.toString(v));
	}
	static void demo(String ...v)
	{
		System.out.println(Arrays.toString(v));
	}
	
	static void multiple(int a, int b, String ...vara)
	{
		
	}
	
	static void fun(int ...var)
	{
		System.out.println(Arrays.toString(var));
	}

}
