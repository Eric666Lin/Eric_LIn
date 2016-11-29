import java.util.Scanner;
public class Lab_06_Ex_04
 {
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int integer = kb.nextInt();
		
				
		System.out.println("Please enter the size of the table: ");
		int Size = kb.nextInt();
		
		
		for (int i = 1; i <= Size; i++)
		{
			System.out.printf("%3d | %3d \n", i, i * integer);
		}
	}
}



