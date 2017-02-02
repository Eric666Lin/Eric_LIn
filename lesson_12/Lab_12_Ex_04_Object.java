
public class Lab_12_Ex_04_Object
{
	private String hair, eyes, skin;
	
	public Lab_12_Ex_04_Object()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public Lab_12_Ex_04_Object(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
		
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}