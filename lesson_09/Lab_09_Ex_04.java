import java.util.Scanner;

public class Lab_09_Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your starting number.");
		int st = kb.nextInt();
		System.out.println("Enter your sequence size.");
		int sz = kb.nextInt();
		
		int[] sequence = new int[sz];
		
		for(int i = 0; i < sz; i++)
		{
			if(i == 0 || i == 1)
			{
				sequence [i] = st;
			}
			else
			{
				sequence[i] = sequence[i-1] + sequence[i-2];
			}
			System.out.print(sequence[i] + " "); 
		}
	}
}