import java.util.Scanner;
public class Lab_12_Ex_06_Runner
{
	public static void main(String[]args)
	{
		String m, n, c, yorn;
		int u;
		double p;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the manufacturer: ");
		m = kb.next();
		
		System.out.println("Please enter the name: ");
		n = kb.next();
		
		System.out.println("Will you be entering category and price information? (y or n) ");
		yorn = kb.next();
		
		if(yorn.equals("n"))
		{
			Lab_12_Ex_06_Object object = new Lab_12_Ex_06_Object(m, n);
			System.out.println(object);
		}
		
		if(yorn.equals("y"))
		{
			System.out.println("Please enter the category: ");
			c = kb.next();
			System.out.println("Please enter the price");
			p = kb.nextDouble();
			Lab_12_Ex_06_Object = new Lab_12_Ex_06_Object(m, n, c, p);
			System.out.println(object1);
		}
	}
}