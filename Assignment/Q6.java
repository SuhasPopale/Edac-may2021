import java.util.*;

class Q6
{
	public static void main(String args [])
	{
		
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Input First Number: ");
	int num1= sc.nextInt();
	System.out.print("Input second Number: ");
	int num2= sc.nextInt();
	 int c= num1+num2;
	 int d= num1-num2;
	 int e= num1*num2;
	 int f= num1/num2;
	 int g= num1%num2;
	 
	 System.out.println(num1 + " + "  + num2 + " = " + c);
	 System.out.println(num1 + " - "  + num2 + " = " + d);
	 System.out.println(num1 + " * "  + num2 + " = " + e);
	 System.out.println(num1 + " / "  + num2 + " = " + f);
	 System.out.println(num1 + " % "  + num2 + " = " + g);
	}
}