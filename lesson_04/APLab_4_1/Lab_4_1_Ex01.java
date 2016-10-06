import java.util.Scanner;

public class Lab_4_1_Ex01
{
	public static void main(String[]args)
	{
		Lab_4_1_Ex01 CompIn = new Lab_4_1_Ex01();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println(" Please enter interest rate.");
		double r = kb.nextDouble();
		System.out.println(" Please enter principal.");
		double p = kb.nextDouble();
		System.out.println(" Please enter number of times the loan is compounded per year.");
		double n = kb.nextDouble();
		System.out.println(" Please enter life of the loan (yrs).");
		double t = kb.nextDouble();
		
		double Percent = r / 100;
		
		double payment = CompIn.calcCI(Percent, p ,n,t);
		
		System.out.printf("Your monthly payment will be $ %1.2f", payment );
	}
	
	public double calcCI(double r, double p, double n, double t)
	{
		return p * Math.pow( 1 + r / n, n * t)/t/12;
	}
}