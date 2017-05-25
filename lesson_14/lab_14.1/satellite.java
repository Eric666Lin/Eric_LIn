import java.util.ArrayList;
public class satellite
{
   public static void main(String[]args)
   {
       ArrayList<locate> ls = new ArrayList<>();
       double[] honLoc = {5, 6};
       ls.add(new honda(honLoc));
       ls.add(new toyota("8, 9"));
       ls.add(new gmc(3, 8));

        double[] home = {0, 0};

        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

        for (locate l : ls)
       {
           printout += "\nlocate for " + l.getID() + ": (" + getlocate(l.getLoc()) + ")";
       }

        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (locate l : ls)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }
	   
	   printout += "\n\n" + "==========================";
	   for(locate l: ls)
	   {
		   double one = Math.random()* 100 + 1;
		   double two = Math.random()* 100 + 1;
		   double[] coordinates = {one, two};
		   ((car)l).move(one, two);
		   printout += "\nAfter " + l.getID() + " Moved " + getlocate(coordinates) +
						"\nNew Location: " + getlocate(l.getLoc());		   
	   }
	   
	   

        System.out.println(printout);
   }

    public static String getDistance(double[] car, double[] home)
   {
       return String.format("%.2f", Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2))));
   }

    public static String getlocate(double[] loc)
   {
       return String.format("(%.2f, %.2f)", loc[0], loc[1]);
   }
}