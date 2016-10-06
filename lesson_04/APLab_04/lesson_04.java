
public class lesson_04
{
	public static void main(String[]args)
	{
		lesson_04 form = new lesson_04();
		
		String word1 = "cake";
		double num1 = 361651.2;
		
		form.format(word1, num1);
		
		String word2 = "bread";
		double num2 = 65165.1256;
		form.format(word2, num2);
		
	}
	
	public void format(String word, double num)
	{
		System.out.printf("\n%10s.......%10.2f", word, num);
	}
}