class Pattern13
{
	public static void main(String [] args)
	{
		for (int i=1; i<=5; i++)
		{
			int alpha=64;
			for (int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print((char)(alpha+i)+" ");
			}
			System.out.println();
		}
	}
}
			