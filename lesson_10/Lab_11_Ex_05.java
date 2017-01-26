import java.util.Scanner;
public class Lab_11_Ex_05 
{
	static int bulletCount;
	static int clipsize = 16;
	static int shotCount;
	static String[] clip;
	
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clip = new String[clipsize];
		
		resetClip();
		String action;
		
		while (bulletCount > 0 || shotCount > 0) 
		{
			System.out.println("Action: ");
			action = kb.next();
			if (action.equals("R")) 
			{
				reload();
			}
			if (action.equals("S")) 
			{
				System.out.println(shoot());
			}
			printClip();
		}
		System.out.println("NO MORE BULLETS");
	}
	public static void resetClip() 
	{
		for (int i = 0; i < clip.length; i++) 
		{
			clip[i] = " [] ";
		}
	}
	public static String shoot() 
	{
		if (shotCount > 0) 
		{
			clip[shotCount-1] = "[]";
			shotCount--;
			return "Bang!";
		}
		else return "Reload! ";
	}
	public static void reload()
	{
		if (bulletCount >= clipsize) 
		{
			bulletCount -= clipsize;
			shotCount = clipsize;
		}
		else 
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for (int i = 0; i < shotCount; i++) 
		{
			clip[i] = " * ";
		}
	}
	public static void printClip() 
	{
		String output = "";
		output += "Bullets:\t" + bulletCount + "\nClip:\t";
		for (int i = 0; i < clipsize; i++) 
		{
			output += clip[i];
		}
		System.out.println(output);
	}
}