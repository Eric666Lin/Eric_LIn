import java.util.Scanner;
public class Cube
{	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the length of one side of your cube");
		double s = keyboard.nextDouble();
		 
		double sa = Cube.calcSurf (s);
		System.out.printf("The cube with the sides %.2f has a surface area of %.2f",s,sa);
	}
	
	public static double calcSurf(double s)
	{
		return 6* (s*s) ;
	}

}