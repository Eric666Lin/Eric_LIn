import java.util.Scanner; //import Statement

public class Ex_02
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Hello, I am the BMI calculater, please tell me your height in inches?");
		int h = keyboard.nextInt();
		System.out.println("Okay now please tell me your weight in pounds?");
		int w = keyboard.nextInt();
		int bmi = 703 * w / h / h;
		
		System.out.println("Your metric BMI is " + bmi +".");
		
	}
	
}