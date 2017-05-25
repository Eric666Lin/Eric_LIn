public class toyota implements location
{
	private double corx, cory;
	private double[] locate;
	
	public toyota(String loc)
	{
		String[] locate = loc.split(", ");
		corx = Double.parseDouble(locate[0]);
		cory = Double.parseDouble(locate[1]);
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