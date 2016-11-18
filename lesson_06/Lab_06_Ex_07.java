import java.util.Scanner;
public class Lab_06_Ex_07
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your word: ");
		String word = kb.next();
		System.out.println("");
		
		for(int i = word.length(); i > 0; i--)
		{
			System.out.println(word.substring(i));
		}
	}
}