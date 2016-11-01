import java.util.Scanner;
public class Lab_05_Ex_02
{
		
	public static void main(String[]args)
	{
		Lab_05_Ex_02 form = new Lab_05_Ex_02();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What's your first product?");
		String product1 = kb.nextLine();
		System.out.println("What's the price of it?");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("What's your second product?");
		String product2 = kb.nextLine();
		System.out.println("What's the price of it?");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("What's your third product?");
		String product3 = kb. nextLine();
		System.out.println("What's the price of it?");
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("What's your forth product?");
		String product4 = kb. nextLine();
		System.out.println("What's the price of it?");
		double price4 = kb.nextDouble();
		
		String product5 = "Subtotal";
		double price5 = price1 + price2 + price3 + price4;
		String product6 = "Discount"; 
		double price6 = calcDis(price5);
		String product7 = "Tax";
		double price7 = (price1 + price2 + price3 + price4)*0.08;
		String product8 = "total";
		double price8 = price5 - price6 + price7;
		
	
		
		
		System.out.println("<<<<<<<<<<<<<Recipt>>>>>>>>>>>>>>>>");
		System.out.println("\n");
		form.format(product1, price1);
		form.format(product2, price2);
		form.format(product3, price3);
		form.format(product4, price4);
		form.format(product5, price5);
		form.format(product6, price6);
		form.format(product7, price7);
		form.format(product8, price8);
		System.out.println("\n");
		System.out.println("_______________________________________________");
		System.out.println("\n");
		System.out.println("Thank you for shopping at walmart, please come again ");
	}		
		
	static double price6;		
	static double price5;	
	public static double calcDis(double price5)
	{
		if (price5>= 2000)
		{
			price6 = price5*0.25;
		}
		if (price5< 2000)
		{		
	 		price6 = 0;
		}
		return price6;
	}	
	
	
	public void format(String product, double price)
	{
		System.out.printf("\n*%20s\t.......... %10.2f", product, price);
	}
	
}