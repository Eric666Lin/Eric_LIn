import java.util.Scanner;

public class Lab_4_1_Ex04
{
	public static void main(String[]args)
	{
		Lab_4_1_Ex04 Volume = new Lab_4_1_Ex04();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height in inches.");
		double h = kb.nextDouble();
		System.out.println("Enter length in inches.");
		double l = kb.nextDouble();
		System.out.println("Enter width in inches.");
		double w = kb.nextDouble();
		
		double Vol = Volume.calcVol(h,l,w);
		
		System.out.printf("The volume of the  is Subwoofer Box %10.2f cubic foot", Vol );
	}
	
	public double calcVol(double h, double l, double w)
	{
		return h * l * w /1728;
	}
}