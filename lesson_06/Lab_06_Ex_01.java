import java.util.Scanner;

public class Lab_06_Ex_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your word.");
		String word = keyboard.nextLine();
		
		

		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word);
		}
		
	}
	
}