import java.util.Scanner;

public class Average
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double number1 = kb.nextDouble();
		
		System.out.println("Enter the second number");
		double number2 = kb.nextDouble();
		
		System.out.println("Enter the third number");
		double number3 = kb.nextDouble();
		
		double avg = Average.calcAvg (number1, number2, number3);
		
		System.out.printf("The average of %.2f,%.2f,and %.2f is %.2f",number1,number2,number3,avg);
	}
	
	public static double calcAvg(double number1, double number2, double number3)
	{
		return (number1+number2+number3)/3;
	}
}	