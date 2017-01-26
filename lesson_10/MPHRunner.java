import java.util.Scanner;
public class Lab_12_Ex_01_Runner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your distance in miles");
		int distance = keyboard.nextInt();
		System.out.println("Please enter your number of hours");
		int hours = keyboard.nextInt();
		System.out.println("Please enter your number of minutes");
		int minutes = keyboard.nextInt();
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		System.out.println(distance + "miles in" + hours + "hours " + minutes + "minutes" + "\t= " + object.getMPH() + " mph");	
	}
		
}