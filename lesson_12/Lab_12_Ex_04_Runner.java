import java.util.Scanner;
public class Lab_12_Ex_04_Runner
{
	
	public static void main(String[]args)
	{
	Scanner kb = new Scanner(System.in);
	System.out.println("What is the color of your hair?");
	String hair = kb.nextLine();
	System.out.println("What are the color of your eyes?");
	String eyes = kb.nextLine();
	System.out.println("What is the color of your skin?");
	String skin = kb.nextLine();
	
	
	Lab_12_Ex_04_Object object = new Lab_12_Ex_04_Object(hair, eyes, skin);
	
	System.out.println("Your information: \n Hair Color: " + object.getHair() + "\n Eye Color: " + object.getEyes() + " \n Skin Color: " + object.getSkin());
	
	object.setHES("brown", "brown", "white");
	
	System.out.println("Friend's information: \n Hair Color: " + object.getHair() + "\n Eye Color: " + object.getEyes() + " \n Skin Color: " + object.getSkin());
	}
}