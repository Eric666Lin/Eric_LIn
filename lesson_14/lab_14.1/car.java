public class car implements locate
{
	double[] location;
	public int ID;
	
	public car()
	{
		location = new double[2];
	}
	
	public void move(double corx, double cory)
	{
		location[0] += corx;
		location[1] += cory;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	
	public double[] getLoc()
	{
		 return location;
	}
}