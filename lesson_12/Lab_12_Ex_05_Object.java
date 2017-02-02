public class Lab_12_Ex_05_Object
{
	private String firstname;
	private String lastname;
	private String avatar;
	private String yon;
	
	public Lab_12_Ex_05_Object()
	{
		firstname = "";
		lastname = "";
		avatar = "";
		yon = "";
	}
	
	public Lab_12_Ex_05_Object(String fN, String lN, String av, String yn)
	{
		firstname = fN;
		lastname = lN;
		avatar = av;
		yon = yn;
	}
	
	public String toString()
	{
	   return "Customer Info...\nFirst Name: " + firstname +
							   "\nLast Name: " + lastname +
							   "\nAvatar: " + avatar +
							   "\nUser ID#: " + userID;
	}
}