public class Lab_05_Ex_01
{
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		
		
		player = (int)(Math.random()*6)+1;
		
		computer =(int)(Math.random()*6)+1;
		
		
		rollDice();
		
		System.out.println(" you rolled a " + player);
		System.out.println(" computer rolled a  " + computer);
		System.out.println(" the winner is  " + winner);
	}
	
public static void rollDice() 
	{
		if (player > computer) 
		{
			winner = "player";
		}
		if (computer > player) 
		{
			winner = "computer";
		}
	}
}