import java.util.Scanner;
public class Cube
{	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the length of one side of your cube");
		double side = keyboard.nextDouble();
		 
		double sa = Cube.calcSurf (side);
		System.out.printf("The cube with the sides %.2f has a surface area of %.2f",side,sa);
	}
	
	public static double calcSurf(double side)
	{
		return 6* (Math.pow (side, 2));
	}

}