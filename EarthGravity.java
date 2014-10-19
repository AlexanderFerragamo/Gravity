/**
* 
* Determines the acceleration due to gravity at some distance
* from the center of the earth.  The distance is read as input
* from the user.
*
* @author <Alexander Ferragamo>
* @version <October 18>
*/


import java.util.Scanner;

public class EarthGravity{

   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      double G      = 6.673e-11;
      double M      = 5.972e24;
      double accelGravity = 0.0;
      
      System.out.println("What is the distace from the center of the earth to the surface (meters)?");
      double distCenter = scnr.nextDouble();
      accelGravity = (G * M) / (distCenter * distCenter);
      System.out.println("The accelaration of gravity is "accelGravity +" m/s/s");
      
      
      
      
      }
      
}