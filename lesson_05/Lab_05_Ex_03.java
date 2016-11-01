import java.util.Scanner;
public class Lab_05_Ex_03
{
		
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What did you get for math this semester?");
		String grade1 = kb.nextLine();
		System.out.println("What did you get for econ/gov this semester?");
		String grade2 = kb.nextLine();
		System.out.println("What did you get for english this semester?");
		String grade3 = kb.nextLine();
		System.out.println("What did you get for computer science this semester?");
		String grade4 = kb.nextLine();
		System.out.println("What did you get for physics this semester?");
		String grade5 = kb.nextLine();
		System.out.println("What did you get for chemistry this semester?");
		String grade6 = kb.nextLine();
		System.out.println("What did you get for biology this semester?");
		String grade7 = kb.nextLine();
		
		double sumgpa = calcPoints(grade1) + calcPoints(grade2) +calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
        

		System.out.println("Your GPA this semester is" + sumgpa/7);
		
	}
	public static double calcPoints(String grade)
	{
		double gradePoints = 0.0;
		if(grade.equals("A"))
			gradePoints = 4.0;
		if(grade.equals("B"))
			gradePoints = 3.0;
		if(grade.equals("C"))
			gradePoints = 2.0;
		if(grade.equals("D"))
			gradePoints = 1.0;
		if(grade.equals("F"))
			gradePoints = 0.0;	
		return gradePoints;
	}
}