public class RetMethods
{
	public static void main (String[]args)
	{
		RetMethods average = new RetMethods();
		
		int num1 = 21;
		
		int num2 = 14;
		
		int num3 = 26;
		
		double avg = average.calcAvg(num1, num2, num3);	
		System.out.printf("The average value is %10.2f", avg );
	}
	
	public double calcAvg(int num1, int num2, int num3)
	{
		return (num1+num2+num3)/3.0;
	}
}