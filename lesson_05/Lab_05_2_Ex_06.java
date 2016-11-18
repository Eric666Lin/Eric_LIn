import java.util.Scanner;
public class Lab_05_2_Ex_06
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("Let's create a new account for computer science class!");
		System.out.println("Please enter your username.");
		String user = kb.next();
		System.out.println("Please enter your password.");
		String pass = kb.next();
		System.out.println("Please conform your username and password");
		System.out.println("Please reenter your username.");
		String reuser = kb.next();
		System.out.println("Please reenter your password.");
		String repass = kb.next();
		if(reuser.equals(user) && repass.equals(pass))
		{	
			System.out.println("Account registration success. Your account has been created !");
		}
		else if (reuser.equals(user) && !repass.equals(pass))
		{
			System.out.println(" Account registration failure. Incorrect password !");	
		}
	    else if (!reuser.equals(user) && repass.equals(pass))
		{
			System.out.println("Account registration failure. Incorrect username !");
		}
		else 
		{
			System.out.println("Account registration failure. Incorrect username and password !");
		}
	}
}