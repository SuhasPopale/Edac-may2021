import java.util.*;

class Q11
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Radius: ");
		double a=sc.nextFloat();
		double p=2*Math.PI*a;
		System.out.println("Perimeter is: "+p);
		double q=Math.PI*a*a;
		System.out.println("Area is: "+q);
	}
}