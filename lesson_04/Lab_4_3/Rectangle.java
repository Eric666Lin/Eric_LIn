import java.util.Scanner;

public class Rectangle
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);

		System.out.println(" Enter width in feet:");
		double w = kb.nextDouble();
		
		System.out.println(" Enter length in feet:");
		double l = kb.nextDouble();
        print(calcPerim(l,w));
		
	}
	public static double calcPerim(double l, double w)
	{
		return( 2 * l + 2 * w );
	}
	public static void print(double perim)
	{
	 System.out.printf("Your rectangle is around %.2f  ft .", perim);
	}
		
}