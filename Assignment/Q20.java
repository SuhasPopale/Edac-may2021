import java.util.Scanner;
class Q20 
{
      public static void main(String args[])
    {
        int num, rem;
        String hexnum="";
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
        num = in.nextInt();
		
        while(num>0)
        {
            rem = num%16;
            hexnum = hex[rem] + hexnum;
            num = num/16;
        }
        System.out.print("Hexadecimal number is : "+hexnum+"\n");         
    }
}