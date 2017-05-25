public class gmc implements location
{
	private double corx, cory;
	
	public gmc(double a, double b)
	{
		corx = a;
		cory = b;
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
		double[] locate = {corx,cory};
		return locate;
	}
}