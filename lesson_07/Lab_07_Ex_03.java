import java.util.Scanner;
public class Lab_07_Ex_03

{
	static int number;
	static int rev = 0;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number.");
		number = keyboard.nextInt();
		getReverse();
		System.out.println(number + " reversed is " + rev);
	}
	public static void getReverse()
	{
		int num = number;
		while(num > 0)
		{
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
	}
}