import java.util.Scanner;
public class Lab_12_Ex_03_Runner
	public static void main(String[]args)
	{
		String p = "";
		String i = "";
		String e = "";
		String t = "";
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter paint: ");
		p = kb.nextLine();
		
		System.out.println("Please enter interior: ");
		i = kb.nextLine();
		
		System.out.println("Please enter engine: ");
		e = kb.nextLine();
		
		System.out.println("Please enter tires: ");
		t = kb.nextLine();
		
		Lab_12_Ex_03_Object object = new Lab_12_Ex_03_Object(p, i, e, t);
		
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint: +\t" + object.getPaint());
		System.out.println("Interior: +\t" + object.getInterior());
		System.out.println("Engine: +\t" + object.getEngine());
		System.out.println("Tires: +\t" + object.getTires());
	}
}