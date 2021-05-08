
import java.util.*;

class Q15
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a" +"=" +a);
		System.out.println("b" +"=" +b);
		System.out.println("After Swapping numbers are: ");
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("a" +"=" +a);
		System.out.println("b" +"=" +b);
	}
	
}