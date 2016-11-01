import java.util.Scanner;

public class Lab_04_Ex_01
{
	public static void main(String[]args)
	{
		Lab_04_Ex_01 form = new Lab_04_Ex_01();
		Scanner kb = new Scanner(System.in);
		
	
		System.out.println("Please enter product1: ");
		String product1 = kb.nextLine();
		System.out.println("Please enter the cost for product1: ");
		Double cost1 = kb.nextDouble();
		
		System.out.println("Please enter product2: ");
		String product2 = kb.next();
		kb.nextLine();
		System.out.println("Please enter the cost for product2: ");
		Double cost2 = kb.nextDouble();
		
		System.out.println("Please enter product3: ");
		String product3 = kb.next();
		kb.nextLine();
		System.out.println("Please enter the cost for product3: ");
		Double cost3 = kb.nextDouble();
		
		String product4 = "Subtotal";
		Double cost4 = cost1 + cost2 +cost3;
		String product5 = "Tax";
		Double cost5 = cost4 * 0.08665;
		String product6 = "Total";
		Double cost6 = cost4 + cost5;
		
		
		System.out.println("\n<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		form.format(product1, cost1);
		form.format(product2, cost2);
		form.format(product3, cost3);
		
		form.format(product4, cost4);
		form.format(product5, cost5);
		form.format(product6, cost6);
		
		System.out.println("\n__________________________________________");
		System.out.println("\n * Thank you for shopping at walmart, please come again *");
		
		
	}
	public void format(String product, double cost)
	{
		
		System.out.printf("\n*\t%20s ...............\t%10.2f", product, cost);
	}
	

}