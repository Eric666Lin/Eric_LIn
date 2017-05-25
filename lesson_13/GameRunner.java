public class GameRunner
{
	public static void main(String[]args)
	{
		PlayStation pl = new PlayStation("Super Mario");
		XBox xb = new XBox("GTA 5");
		PC th = new PC("World of Warcraft");
		
		System.out.println(pl.toString());
		System.out.println(xb.toString());
		System.out.println(th.toString());
	}
}