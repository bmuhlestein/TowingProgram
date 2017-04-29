/**
 * Created by Muhlestein on 29-Apr-17.
 */
import java.util.*;

public class RunTowProgram
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);

        //Variables
        String sTowVehicle;
        int iGVWR;

        //Welcome
        System.out.println("Welcome to the Towing Calculator.");
        System.out.println("We will determine if your vehicle can properly tow your trailer.");


        //Enter vehicle distinction
        System.out.println("\nPlease enter your a name to distinguish your towing vehicle.");
        sTowVehicle = in.nextLine();

        //Setting up tow vehicle
        TowingVehicle v1 = new TowingVehicle(sTowVehicle);

        System.out.println("\nPlease enter " + sTowVehicle + "'s GVWR (Gross Vehicle Weight Rating):");
        iGVWR = in.nextInt();




    }
}
