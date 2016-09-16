import java.util.Scanner; //import Statement

public class Ex_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Hi, I will calculate the area of a your triangle. ");
		
		System.out.println("please enter the base");
		int b = keyboard.nextInt();
		
		System.out.println("please enter the height");
		int h = keyboard.nextInt();
		
		int x = b * h / 2;
		
		System.out.println("Area of the triangle is " + x);
	}
}