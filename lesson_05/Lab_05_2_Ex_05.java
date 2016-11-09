import java.util.Scanner;
public class Lab_05_2_Ex_05
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You are save one person between your sibiling and your parents. who would you save?");
		String choice = keyboard.next();
		if (choice.equals("sibiling"))
		{
			System.out.println("If you have an younger and an older sibiling. Which one would you save ?");
			String age = keyboard.next();
			if(age.equals("younger"))
			{
				System.out.println(" Would it be your yonger sister or brother?");
				String younggender = keyboard.next();
				if(younggender.equals ("sister"))
				{
					System.out.println("You are such thoughtful and caring sibiling.");
				}
				else
				{
					System.out.println("You really don't like your little sister do you.");
				}
			}
			else
			{
				System.out.println("Would it be your older sister or brother?");
				String oldgender = keyboard.next();
				if(oldgender.equals ("sister"))
				{
					System.out.println("You are such thoughtful and caring sibiling.");
				}
				else
				{
					System.out.println("You really don't like your older sister do you.");
				}
			}
		}
		else
		{
			System.out.println("Would save your mother or father?");
			String bioparent = keyboard.next();
			if(bioparent.equals("mother"))
			{
				System.out.println("Assume you have a step mother, would you save your step mother or your biological mother?");
				String mother = keyboard.next();
				if(mother.equals ("step"))
				{
					System.out.println("looks like your step mother treats you better than your biological mother .");
				}
				else
				{
					System.out.println("looks like you are more fonded to your biological mother .");
				}
			}
			else
			{
				System.out.println("Assume you have a step father, would you save your step father or your biological father?");
				String father = keyboard.next();
				if(father.equals ("step"))
				{
					System.out.println("looks like your step father treats your mother better than your biological father .");
				}
				else
				{
					System.out.println("your mother must have hated your father.");
				}
			}
		
		}
	}
}