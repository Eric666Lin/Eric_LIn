import java.util.Scanner;

public class Lab_04_2_Ex_03 
{
	
	static double side;
	static double surfaceArea;

	public static void main(String[]args)
	{
	
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of one side of your cube:");
		side = kb.nextDouble();
		
		calcSurf();
		print();
		
	}
	public static void calcSurf() 
	{
		surfaceArea =  6 * (side * side);
	}
	public static void print() 
	{
		System.out.printf("The cube with the sides %.2f has a surface area of %.2f\n", side, surfaceArea);
	}
}