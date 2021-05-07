import java.util.*;

class ArrayQ1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array1: ");
		int a[]=new a[5];
		System.out.println("Enter Array2: ");
		int b[]=new b[3];
		for (int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<5; i++)
		{
			System.out.print(a[i]+" ");
		}
		for (int i=0; i<3; i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0; i<3; i++)
		{
			System.out.print(b[i]+" ");
		}
		if(i<3)
			System.out.print(a[i]+","+b[i]);
		else
			System.out.print(","a[i]+" ");
	}
}