// Program 5, Sara Kendig Scanner

import java.util.Scanner;

public class SKMileageScanner
{
   public static void main(String[] args)
   {
      double miles;      // miles driven
      double gallons;    // gallons
      double mpg;        // Miles per gallon

      
      
      //Print what the program does
      System.out.println("This program will calculate mileage.");
      
      // new Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // get miles driven
      System.out.println("Enter miles driven:");
      
      miles = keyboard.nextDouble();
      
      // get gallons used
       System.out.println("Enter the gallons used: ");
      
      gallons = keyboard.nextDouble();
      
      // Calulate MPG by dividing miles driven by gallons used
      mpg = miles / gallons;
      
      // Show MPG
      System.out.println(mpg + " miles per gallon");
      
      // Show MPG with 2 decimal points
      System.out.printf(String.format ("%.2f",mpg) + " miles per gallon");
      
   }
}