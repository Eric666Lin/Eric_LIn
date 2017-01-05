public class Lab_09_Ex_05
{
	static int[] numbers;
	static int[] odds;
	
	public static void main(String[]args) 
	{
		numbers = new int[10];
		fillArray();
		printArray();
		System.out.println("These numbers" + getOdds() + "are odd numbers");
	}
	public static void fillArray() 
	{
		for (int i=0; i< numbers.length; i++) 
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void printArray() 
	{
		for (int num : numbers) 
		{
			System.out.print(" "+num + " ");
		}
		System.out.println();
	}
	public static String getOdds() 
	{
		String odds = "";
		for (int num : numbers) 
		{
			if (num % 2 == 1) 
			{
				odds += " "+ num + " ";
			}
		}
		return odds;
	}
}