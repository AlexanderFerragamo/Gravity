/**
* 
* Determines the acceleration due to gravity at some distance
* from the center of the moon.  The distance is read as input
* from the user.
*
* @author <Alexander>
* @version <October 18>
*/

import java.util.Scanner;

public class MoonGravity{

   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      double G      = 6.673e-11;
      double M      = 7.348e22;
      double accelGravity = 0.0;
      
      System.out.println("What is the distace from the center of the moon to the surface (meters)?");
      double distCenter = scnr.nextDouble();
      accelGravity = (G * M) / (distCenter * distCenter);
      System.out.println("The accelaration of gravity is "accelGravity +" m/s/s");
      
      }
      
}