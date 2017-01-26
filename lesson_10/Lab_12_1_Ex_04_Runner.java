import java.util.Scanner;
public class Lab_12_1_Ex_04_Runner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter hair");
		String paint = keyboard.nextLine();
		System.out.println("enter eye");
		String interior = keyboard.nextLine();
		System.out.println("enter skin");
		String engine = keyboard.nextLine();
		
		Lab_12_1_Ex_04_Object object = new Lab_12_1_Ex_04_Object(hair, eye, skin);
		
		System.out.println("My info...");
		System.out.println("Hair: +\t" + object.getHair());
		System.out.println("Eye: +\t" + object.getEye());
		System.out.println("Skin: +\t" + object.getSkin());
		
		System.out.println("Friend's info...");
		System.out.println("Hair: blonde");
		System.out.println("Eye: blue");
		System.out.println("Skin: white");
	}
}