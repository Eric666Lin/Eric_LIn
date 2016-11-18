import java.util.Scanner;

public class Ex6_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your word.");
		String word = kb.next();
		System.out.println("");
		System.out.println("");
			
		for (int i = 0; i < word.length(); i++)
		{
			System.out.println(word);
		}
	}
}