import java.util.Scanner;

public class Lab_04_Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Lab_04_Ex_01 form = new Lab_04_Ex_01();
	
		System.out.println("Please enter item 1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price: ");
		Double price1 = kb.nextDouble();
		
		System.out.println("Please enter item 2: ");
		String item2 = kb.next();
		kb.nextLine();
		System.out.println("Please enter the price: ");
		Double price2 = kb.nextDouble();
		
		System.out.println("Please enter item 3: ");
		String item3 = kb.next();
		kb.nextLine();
		System.out.println("Please enter the price: ");
		Double price3 = kb.nextDouble();
		
		String item4 = "Subtotal";
		Double price4 = price1 + price2 +price3;
		String item5 = "Tax";
		Double price5 = price4 * 0.08665;
		String item6 = "Total";
		Double price6 = price4 + price5;
		
		
		System.out.println("\n<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		
		form.format(item4, price4);
		form.format(item5, price5);
		form.format(item6, price6);
		
		System.out.println("\n__________________________________________");
		System.out.println("\n * Thanks for your support *");
		
		
	}
	public void format(String item, double price)
	{
		
		System.out.printf("\n*\t%20s ...............\t%10.2f", item, price);
	}
	

}