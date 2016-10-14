import java.util.Scanner;

public class Average
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first number?");
		double number1 = kb.nextDouble();
		
		System.out.println("Enter the second number?");
		double number2 = kb.nextDouble();
		
		System.out.println("Enter the third number?");
		double number3 = kb.nextDouble();
		
		double avg = Average.average (number1, number2, number3);
		
		System.out.printf("The average of %10.2f\t,%10.2f\t,and %10.2f is %10.2f",number1,number2,number3,avg);
	}
	
	public static double average(double number1, double number2, double number3)
	{
		return (number1+number2+number3)/3;
	}
}	