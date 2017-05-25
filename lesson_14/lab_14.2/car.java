public class car implements location
{
	public final int id = (int)(Math.random()*1000000);
	public double[] location;
	public car()
	{
		location = new double[2];
	}
	public car(double corx, double cory)
	{
		location = new double[2];
		location[0] = corx;
		location[1] = cory;
	}
	public int getID()
	{
		return id;
	}
	public void move(double corx, double cory)
	{
		location[0] += corx;
		location[1] += cory;
	}
	public double[] getLoc()
	{
		return location;
	}
}