import java.util.Scanner;
public class Lab_09_Ex_01
{
	static String worda;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		String [] words = new String[5];
		System.out.println("Please enter any random five words .");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = keyboard.next();
		}
		
		System.out.println();
		
		System.out.print("In order : ");
		for(String word : words)
		{
			System.out.print( " "+ word + " " );
		}
		System.out.println(" ");
		
		System.out.println();
		
		System.out.print("Reversed : ");
		reverse(words);
	}
	public static void reverse(String [] words)
	{
		for(int i = words.length; i > 0; i--)
		{
			System.out.print(" " +words[i-1] + " ");
		}
	}
}