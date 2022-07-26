/*
   Sara Kendig
   7/12/2022
   CPS 121
   
   This program gathers the users hours and pay rate then multiplies them to get their gross pay. 
   It then displays their first and last name along with their gross pay.

*/

import javax.swing.JOptionPane;  //Needed for displaying the dialogs

public class SKPayRate2
{
   public static void main(String[] args)
   {
      String input;           //for input
      String firstName;       //first name
      String lastName;        //last name
      int hours;              //hours
      int payRate;            //pay rate
      int grossPay;           //gross pay
      
      
      //get the first name
      firstName = JOptionPane.showInputDialog("What is your first name? ");
      
      
      
      //get the last name
      lastName = JOptionPane.showInputDialog("What is your Last Name? ");
      
      
      //get the hours worked
      input = JOptionPane.showInputDialog("Enter hours worked: ");
      
      
      //convert input to int
      hours = Integer.parseInt(input);
      
      
      //get hourly pay
      input =JOptionPane.showInputDialog("Enter hourly pay: ");
      
      
      //convert hourly pay to int
      payRate = Integer.parseInt(input);
      
      
      //calculate gross pay
      grossPay = hours * payRate;
      
      
      //Display the results
      System.out.println("Hello" + " " + firstName + " " + lastName + ",");
      System.out.println("Your gross pay is $" + grossPay + ".");
   }
}
      
      
      
      
      
      