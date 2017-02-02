
import java.util.Scanner;
public class Lab_12_Ex_03_Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the color of the paint :");
		String p = kb.nextLine();
		System.out.println("Enter the type of the interior : ");
		String i = kb.nextLine();
		System.out.println("Enter the type of the engine : ");
		String e = kb.nextLine();
		System.out.println("Enter the type of the tires: ");
		String t = kb.nextLine();
		
		Lab_12_Ex_03_Object object = new Lab_12_Ex_03_Object(p, i, e, t);
		
		System.out.println("Your vehicle is ready...... \n Paint: " + object.getPaint() + "\n Interior: " + object.getInterior() + "\n Engine: " + object.getEngine() + "\n Tires: " + object.getTires());
		
	}
}