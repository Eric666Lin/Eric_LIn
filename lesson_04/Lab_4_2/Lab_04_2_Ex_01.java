import java.util.Scanner;

public class Lab_04_2_Ex_01 
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
			
			System.out.println("Enter the width of your rectangle:");
			w = kb.nextDouble();
		
			System.out.println("Enter the length of your rectangle:");
			l = kb.nextDouble();
			
			calcPerim();
			print();
	}
	public static void calcPerim()
	{
		perimeter = 2*(w+l);
	}
	public static void print()
	{
		System.out.printf("The perimeter of your rectangle is around %.2f ft ", perimeter);
	}
}