public class TicketDriver
{
	public static void main(String[]args)
	{
		Advance lin = new Advance(11);
		StudentAdvance Eric = new StudentAdvance(9);
		Walkup ericlin = new Walkup();
		
		System.out.println("Receipt");
		System.out.println();
		
		System.out.println(lin);
		System.out.println();
		
		System.out.println(Eric);
		System.out.println();
		
		System.out.println(ericlin);
	}
}