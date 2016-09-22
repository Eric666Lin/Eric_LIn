
public class lesson_04
{
	public static void main(String[]args)
	{
		lesson_04 form = new lesson_04();
		
		String word1 = "cake";
		double number1 = 84651.2;
		
		form.format(word1, number1);
		
		String word2 = "bread";
		double number2 = 9846.51256;
		form.format(word2, number2);
		
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s.......%10.2f", word, number);
	}
}