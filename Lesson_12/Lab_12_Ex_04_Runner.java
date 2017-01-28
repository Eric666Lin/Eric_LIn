import java.util.Scanner;
public class Lab_12_Ex_04_Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter hair: ");
		String h = kb.nextLine();
		
		System.out.println("Please enter eye: ");
		String e = kb.nextLine();
		
		System.out.println("Please enter skin: ");
		String s = kb.nextLine();
		
		System.out.println("My info...");
		System.out.println("Hair: " + h);
		System.out.println("Eyes: " + e);
		System.out.println("Skin: " + s);
		
		Lab_12_Ex_04_Object object = new Lab_12_Ex_04(h, e, s);
		
		object.setHES("Blonde", "Blue", "White");
		System.out.println("Friend's info...");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
	}
}