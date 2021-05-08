import java.util.Scanner;

public class Q22 
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  int bin, deci= 0, j = 1, remainder;
  System.out.print("Input a binary number: ");
  bin= sc.nextInt();

  while (bin != 0) 
  {
   remainder = bin % 10;
   deci = deci + remainder * j;
   j = j * 2;
   bin = bin / 10;
  }
  System.out.println("Number: " + deci);
 }
}