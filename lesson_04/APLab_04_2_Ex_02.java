import java.util.Scanner;

public class APLab_04_2_Ex_02
{
	public static void main(String[]args)
	{
		APLab_04_2_Ex_02 Volume = new APLab_04_2_Ex_02();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first number.");
		double num1 = keyboard.nextDouble();
		System.out.println("Enter second number.");
		double num2 = keyboard.nextDouble();
		System.out.println("Enter third number.");
		double num3 = keyboard.nextDouble();
		
		double Average = Volume.average(num1 , num2 , num3);
		
		System.out.printf("The average of %1.2f, %1.2f, and %1.2f is %1.2f.", num1, num2, num3, Average );
	}
	
	public double average(double one, double two, double three)
	{
		
		return (one + two + three)/3 ;
	}
}