import java.util.Scanner;
public class Lab_12_Ex_02_Runner
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter x1");
		int x1 = keyboard.nextInt();
		System.out.println("Please enter x2");
		int x2 = keyboard.nextInt();
		System.out.println("Please enter y1");
		int y1 = keyboard.nextInt();
		System.out.println("Please enter y2");
		int y2 = keyboard.nextInt();
		
		Lab_12_Ex_02_Object object = new Lab_12_Ex_02_Object(x1, x2, y1, y2);
		System.out.println("distance = " + object.getDist());
		
	}
}