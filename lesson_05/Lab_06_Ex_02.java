import java.util.Scanner;
public class Lab_06_Ex_02
{
		
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your number.");
		int factorial = 1;
		int number = keyboard.nextInt();
		
	
		
		for(int i = 1 ;i <= number ; i++)
		{
			factorial *= i;

		}
			System.out.println("The factorial is " + factorial);
	}
}

