package java_programming_classes;
import java.util.*;


public class Functions_methods {
	/*access modifier (in oops) return_type name()
	 * {
	 * return statement;
	 * 
	 */
	static void greeting()    //return_type = void, no return statement included.
	{
		System.out.println("Hello Deepanshi");
	}
	
	//RETURNING AN INTEGER
	static int sum()
	{
        Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int num1=in.nextInt();
		System.out.print("Enter number 2: ");
		int num2=in.nextInt();
		int sum = num1 + num2;
		return sum;
		
		//System.out.println("Wont execute");
	}
	
	//RETURNING A STRING
	static String greeting2()
	{
		String greet = "Hello Ms. Deepanshi Tripathi";
		return greet;
	}
	
	//GIVING PARAMETERS(INT)
	static int sum2(int a, int b)
	{
		int sum2 = a + b;
		return sum2;
	}
	
	//GIVING PARAMETERS(STRING)
	static String NameGreet(String names)
	{
		String Msg= "Welcome to Java "+names;
		return Msg;
	}	
	public static void main(String args[])
	{
		//can also do it like int ans = sum()'
		Scanner sc = new Scanner(System.in);
		
		//NameGreet
		System.out.println("Enter  name ");
		String name=sc.nextLine();               //Name for greeting
		System.out.println(NameGreet(name));     //NameGreet Printed
		
		
		//RETURNING AN INTEGER
		System.out.println("Sum of integers: " + sum());    //Printing sum with no parameters passes
		
		//GIVING PARAMETERS(INT)
		System.out.println("Sum of Int by 2nd sum "+sum2(5,7));  //Printing sum with parameters passed 
		
		//GREETING WITH NO RETURN AND DIRECT PRINT STATEMENT 
		greeting(); 
		
		//GREETING WITH RETURN STATEMENT
		System.out.println(greeting2());  
		
	}
}
