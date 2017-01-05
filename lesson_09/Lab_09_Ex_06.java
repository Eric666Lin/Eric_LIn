public class Lab_09_Ex_06
{
	public static int [] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		System.out.println("For the following numbers:");
		fillArray();
		printArray();
		getBiggest();
		System.out.println("The biggest number is " + getBiggest());
	}
	public static void fillArray()
	{

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100 + 1);
		}
	}
	
	public static void printArray()
	{
		for (int num : numbers)
		{
			System.out.print(" "+ num + " "); 
		}
	}
	public static int getBiggest()
	{
		int max = 0;
		
		for(int number : numbers)
		{
			if (number > max)
			{
				max = number;
			}
		}
		return max;
	}
	
}