import java.util.Scanner;

public class Rectangle
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);

		System.out.println(" Enter width of retangle in feet:");
		double w = kb.nextDouble();
		
		System.out.println(" Enter length retangle in feet:");
		double l = kb.nextDouble();
		
        double perimeter = calcPerim(l,w);
		System.out.printf("Your rectangle's perimeter is  %.2f  ft .", perimeter);
	}
	public static double calcPerim(double l, double w)
	{
		return( 2 * l + 2 * w );
	}
	
}