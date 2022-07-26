// Program 5, Sara Kendig Dialog

import javax.swing.JOptionPane;

public class SKMileage
{
   public static void main(String[] args)
   {
      double miles;      // miles driven
      double gallons;    // gallons
      double mpg;        // Miles per gallon
      String input;   // holds input
      
      
      //Print what the program does
      System.out.println("This program will calculate mileage.");
      
      // get miles driven
      input = JOptionPane.showInputDialog("Enter miles driven: ");
      
      miles = Double.parseDouble(input);
      
      // get gallons used
      input = JOptionPane.showInputDialog("Enter the gallons used: ");
      
      gallons = Double.parseDouble(input);
      
      // Calulate MPG by dividing miles driven by gallons used
      mpg = miles / gallons;
      
      // Show MPG
      System.out.println(mpg + " miles per gallon");
      
      // Show MPG with 2 decimal points
      System.out.printf(String.format ("%.2f",mpg) + " miles per gallon");
      
   }
}
      
      
      
      