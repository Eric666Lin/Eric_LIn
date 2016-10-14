import java.util.Scanner;
public class Circle
{	
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the radius of your circle");
		double r = keyboard.nextDouble();
		    
		double area = Circle.calcArea (r);	
		
		System.out.printf("The area of a circle with a radius of %.2f is %.2f",r,area);
		
	}
	
	public static double calcArea(double r)
	{
		return 3.14159*r*r;
	}
	
}