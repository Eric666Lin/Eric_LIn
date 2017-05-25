public class honda implements location
{
	private double[] location;
	private double corx, cory;
	
	public honda(double[] arracory)
	{
		location = arracory;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000)+1;
	}
	
	public void move(double a, double b)
	{
		corx = a;
		cory = b;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}