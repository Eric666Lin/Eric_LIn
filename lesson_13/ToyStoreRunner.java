import java.util.Scanner;
public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		{
			System.out.println("Please enter the toy list.");
			String ToyList = kb.nextLine();
			
			ToyStore object = new ToyStore(ToyList);
			
			
			System.out.println(object);
			
			System.out.println("\n");
			System.out.println("Most Frequent Toy: " + object.getMostFrequentToy());
			System.out.println("Most Frequent Type: " + object.getMostFrequentType());
		}
	}
}