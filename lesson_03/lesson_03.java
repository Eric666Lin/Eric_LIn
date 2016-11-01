import java.util.Scanner; 

public class lesson_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How old are you?");
		
		int num = keyboard.nextInt();
		
		System.out.println("Wow! " + num + " is perfect. You're pretty handsome.");
		
		System.out.println("Who is your favourite teacher?");
		
		String teacher = keyboard.next();
		
		System.out.println("Okay! "+ teacher + " is very goooood!");
	}
}