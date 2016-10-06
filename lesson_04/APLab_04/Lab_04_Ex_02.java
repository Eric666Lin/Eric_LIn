
import java.util.Scanner;

public class Lab_04_Ex_02
{	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Lab_04_Ex_02 form = new Lab_04_Ex_02();
	
		System.out.println("Enter your first name: ");
		String firstcolumn2 = kb.nextLine();
		System.out.println("Enter your last name: ");
		String secondcolumn2 = kb.nextLine();
		
		System.out.println("Enter your title:  ");
		String firstcolumn3 = kb.next();
		kb.nextLine();
		System.out.println("Enter the school site: ");
		String firstcolumn1 = kb.nextLine();
		
		System.out.println("Enter the school year: ");
		String secondcolumn1 = kb.next();
		kb.nextLine();
		System.out.println("What is your subject? ");
		String secondcolumn3 = kb.nextLine();
		
		
		
		System.out.println("\n**********************************");
		
		form.format(firstcolumn1, secondcolumn1);
		form.format(firstcolumn2, secondcolumn2);
		form.format(firstcolumn3, secondcolumn3);
		
		
		System.out.println("\n\n**********************************");
	}	
		public void format(String firstcolumn, String secondcolumn)
	{
		
		System.out.printf("\n*\t%15s\t%15s*", firstcolumn, secondcolumn);
	}
}