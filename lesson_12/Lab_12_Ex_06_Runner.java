import java.util.Scanner;
public class Lab_12_Ex_06_Runner
{
	static Scanner kb = new Scanner(System.in);
	private String manufacture;
	private String name;
	private String category;
	private int UPC;
	private double price;
	public Lab_12_Ex_06_Runner()
	{
		manufacture = "";
		name = "";
		category = "";
		UPC = 1 + (int)(Math.random() * 1000000000) ;
		price = 0;
	}
	public Lab_12_Ex_06_Runner(String m, String n)
	{
		manufacture = m;
		name = n;
		UPC = 1 + (int)(Math.random() * 1000000000);
	}
	public Lab_12_Ex_06_Runner(String m, String n, String c, double p)
	{
		manufacture = m;
		name = n;
		category = c;
		UPC = 1 + (int)(Math.random() * 1000000000) ;
		price = p;
	}
	public String toString()
	{
		return "Item Info...\n manufacture: " + manufacture +
								"\n name: " + name +
								"\n category: " + category +
								"\n UPC#: " + UPC +
								"\n price: " + price;
	}
	public static void main(String[]args)
	{
		System.out.println("Please enter the manufacture of the item");
		String m = kb.next();
		System.out.println("Please enter the name of the item");
		String n = kb.next();
		System.out.println("Would you like to category and price information.(y or n)");
		String yn = kb.next();
		
		
		if(yn == "n")
		{
			Lab_12_Ex_06_Runner Lab_12_Ex_06_Runner1 = new Lab_12_Ex_06_Runner(m, n);
			System.out.println("\n" + Lab_12_Ex_06_Runner1 + "\n");
		}
		else
		{
			System.out.println("Please enter the category of the item");
			String c = kb.next();
			System.out.println("Please enter the price of the item");
			double p = kb.nextDouble();
			Lab_12_Ex_06_Runner Lab_12_Ex_06_Runner1 = new Lab_12_Ex_06_Runner(m, n, c, p);
			System.out.println("\n" + Lab_12_Ex_06_Runner1 + "\n");
		}
	}
}
