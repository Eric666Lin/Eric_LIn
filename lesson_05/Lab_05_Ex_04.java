import java.util.Scanner;
public class Lab_05_Ex_04
{
	static double hight;
	static double wight;
	static double bmi;
	static String condition;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your height in inches: ");
		hight = kb.nextDouble();
		System.out.println("Please enter your weight in pounds: ");
		wight = kb.nextDouble();
		
		calcCondition();
		
		System.out.println("Your BMI is " + bmi);
		System.out.println("You are " + condition); 
	
	}
	public static void calcCondition()
	{
	     bmi = wight / (hight*hight);
		if(bmi < 18.5)
			condition = "Underweight";
		else if(bmi < 24.9)
			condition = "Normal";
		else if(bmi < 29.9)
			condition = "Overweight";
		else if(bmi < 34.9 )
			condition = "Obese";
		else if(35 < bmi)
			condition = "Very Obese";
		else if(39.9 < bmi)
			condition = "Morbidly Obese";
	}	  
	
	}