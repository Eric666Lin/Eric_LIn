import java.util.Scanner;

public class Lab_04_2_Ex_02 
{
	
	static double number1;
	static double number2;
	static double number3;
	static double avg;
	
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		number1 = keyboard.nextDouble();
		
		System.out.println("Enter the second number");
		number2 = keyboard.nextDouble();
		
		System.out.println("Enter the third number");
		number3 = keyboard.nextDouble();
		average();
		print();
	}
	public static void average()
	{
		avg = (number1 + number2 + number3) / 3;
	}
	public static void print()
	{
		System.out.printf("The average of"+ number1, number2 + "and" + number3 + "is %.5f", avg);
	}
}