// Program 6, Sara Kendig

/*
    This program calculates the shipping costs for Fed-Ups shipping company.
*/

import java.util.Scanner;

public class SKShippingCost
{
   public static void main(String[] args)
   {
   
      double length;                // length of package
      double width;                 // width of the package
      double height;                // height of the package
      double weight;                // weight of the package
      double dimensions;            // L * W * H = dimensions
      int zipCode;                  // the zip code
      double charge;                // starting charge based on weight of package    
      double surcharge;             // the surcharge
      double additionalCharge;      // additional charge for even zip code
      double shippingCharges;       // shipping charges
      double totalCost;             // total cost of the shipping
 
      
      
      // Create Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // Get Weight of package
      System.out.println("Enter package weight:");
      
      weight = keyboard.nextDouble();
      
      // Get Length of package
      System.out.println("Enter package length:");
      
      length = keyboard.nextDouble();
      
      
      // get width of package
      System.out.println("Enter package width:");
      
      width = keyboard.nextDouble();
      
      
      // get height of package
      System.out.println("Enter package height:");
      
      height = keyboard.nextDouble();
      
      
      // calculate dimensions
      dimensions = length * width * height;
      
      // test, print dimensions
      System.out.println("Dimensions = " + dimensions);
      
      
      // Calculate charge by weight/dimensions
      
      // Shipping costs if else
      // Weight < 5lbs = $12
      // weight > 5 <= 15 = $14
      // weight > 15 <= 30 = $21
      // weight > 30 <= 45 = $34
      // weight > 45 <= 60 = $50
      // weight > 60 = $105
      
      if (weight <= 5) {
         charge = 12;
         } else if (dimensions > 5 && dimensions <= 15) {
         charge = 14;
         } else if (dimensions > 15 && dimensions <= 30) {
         charge = 21;
         } else if (dimensions > 30 && dimensions <= 45) {
         charge = 34;
         } else if (dimensions > 45 && dimensions <= 60) {
         charge = 50;
         } else {
         charge = 105;
         }
     
     
     // test, print charge
     System.out.println("Charge = " + charge);
     
     
     
      // get the zip code
      System.out.println("Enter zip code: ");
      
      zipCode = keyboard.nextInt();
      
      
      // first number of zip code
      int firstDigit = Integer.parseInt(Integer.toString(zipCode).substring(0, 1));              
     
      // if first digit of zip code = 4, surcharge is 5%
      // if first digit of sip code = 6, surcharge is 7%
      // all other zip codes, surcharge is 9%
          
      switch (firstDigit) {
         case (4): 
            surcharge = .5;
            break;
         case (6): 
            surcharge = .7;
            break;
         default:
            surcharge = .9;
         }
         
      
      
      // test, print surcharge
      System.out.println("Surcharge = " + surcharge);
      
      
      
      // if zip code is even, additional charge of 2%
      
      
      if (zipCode % 2 == 0) {
            additionalCharge = .2;
         }
         else {
            additionalCharge = 0;
         }
         
      
      // test. print additional charge
      System.out.println("Additional charge = " + additionalCharge);
      
      // calculate shipping charges
      
      double surchargeCost;
      
      if (additionalCharge == 0) {
      
          shippingCharges = charge * surcharge;
          
         
      } else {
      
      shippingCharges = ((charge * surcharge) * additionalCharge);
      
      }
      
      
      // test shippingCharges
      System.out.println("Shipping charges = " + shippingCharges);
      
      // calculate total cost
      totalCost = charge + shippingCharges;
      
      
      // Print information to customer
      System.out.println("The surcharge is: " + surcharge);
      System.out.println("The zip code is: " + zipCode);
      System.out.println("The shipping charges are: " + shippingCharges);
      System.out.println("The weight of the package is: " + weight);
      System.out.println("The total cost to ship is: " + totalCost);

      
   }
}
            