import java.util.Scanner;
public class Lab_12_Ex_05_Runner
{
	public static void main(String[]args)
	{
		String f, l, yorn, a;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter first name: ");
		f = kb.next();
		
		System.out.println("Please enter last name: ");
		l = kb.next();
		
		System.out.println("Would you like to use a public avatar? (y or n): ");
		yorn = kb.next();
		
		
		if(yorn.equals("n"))
		{
			Lab_12_Ex_05_Object object = new Lab_12_Ex_05_Object(f, l);
			System.out.println(object);
		}
			
		if(yorn.equals("y"))
		{
			System.out.println("Enter your avatar name: ");
			a = kb.next();
			Lab_12_Ex_05_Object object1 = new Lab_12_Ex_05_Object(f, l, a);
			System.out.println(object1);
		}
	}
}