import java.util.Scanner;
public class Lab_06_Ex_05
{
		public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Please enter the difference of each number in the arithmetic series ");
		int num1 = kb.nextInt();
		System.out.println("PLease enter the last number of the arithmetic series ");
		int num2 = kb.nextInt();
		
		for (int i = num1; i <= num2; i += num1)
		{
			System.out.printf(i + " ");
		}
	}
}

