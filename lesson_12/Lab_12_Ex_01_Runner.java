
import java.util.Scanner;
public class Lab_12_Ex_01_Runner
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter distance:");
		int distance = keyboard.nextInt();
		System.out.println("Enter hours:");
		int hours= keyboard.nextInt();
		System.out.println("Enter minutes:");
		int minutes = keyboard.nextInt();
		
		Lab_12_Ex_01_Object object = new Lab_12_Ex_01_Object(distance, hours, minutes);
		
		System.out.println( distance + " miles in " + hours + " hours = " + object.getMPH() + " mph");
	}
}