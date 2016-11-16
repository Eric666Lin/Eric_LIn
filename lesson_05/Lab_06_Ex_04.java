import java.util.Scanner;
public class Lab_06_Ex_04
 {
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int integer = keyboard.nextInt();
		
		
		
		System.out.println("Please enter the size of the table: ");
		int Size = keyboard.nextInt();
		
		
		for (int i = 1; i <= Size; i++)
		{
			System.out.printf("%3d | %3d \n", i, i * integer);
		}
	}
}



