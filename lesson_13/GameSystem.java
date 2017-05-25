public class GameSystem
{
	public String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform = " ";
		this.serialNo = (int)(Math.random() * 1000000);
	}
	
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 1000000);
	}
	
	public String getPlatform()
	{
		return this.platform;
	}
	
	public int getNo()
	{
		return this.serialNo;
	}
	
	public void setPlatform(String p)
	{
		this.platform = p;
	}
	
	public void setNo(int serialNo)
	{
		this.serialNo = (int)(Math.random() * 1000000);
	}
}