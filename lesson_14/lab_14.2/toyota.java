public class toyota extends car
{
	public toyota()
	{
		super();
	}
	public toyota(String l)
	{
		super(Double.parseDouble(l.split(",")[0]),Double.parseDouble(l.split(",")[1]));
	}
}