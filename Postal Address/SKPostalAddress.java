// Program 3, Sara Kendig, CPS 121

/**
   This program will prompt the user to input their postal information
   and print it to the console window\
*/

import java.util.Scanner;      // needed for the Scanner class



public class SKPostalAddress
{
   public static void main(String[] args)
   {
   
   String firstName;     // holds first name
   String lastName;      // holds last name
   int month;            // number of birth month
   int birthday;         // number of birth day
   int year;             // number of birth year
   String city;          // holds birth city
   String state;         // holds birth state
   
   // Create a scanner object for keyboard input.
   Scanner keyboard = new Scanner(System.in);
   
   // Get users first name 
   System.out.print("Please enter your first name: ");
   firstName = keyboard.nextLine();
   
   // Get users last name
   System.out.print("Please enter your last name: ");
   lastName = keyboard.nextLine();
   
   // Get users birth month
   System.out.print("Please enter your birth month: ");
   month = keyboard.nextInt();
   
    // Get users birth birth day
   System.out.print("Please enter your birth day: ");
   birthday = keyboard.nextInt();
   
    // Get users birth year
   System.out.print("Please enter your birth year: ");
   year = keyboard.nextInt();
   
   
   // consume the remaining newline character
   keyboard.nextLine();
   
       // Get users birth city
   System.out.print("Please enter your birth city: ");
   city = keyboard.nextLine();
   
    // Get users birth state
   System.out.print("Please enter your birth state: ");
   state = keyboard.nextLine();
   
   //Display the results
   System.out.println("Name: " + firstName + " " + lastName);
   System.out.println("Birthday: " + month + "/" + birthday + "/" + year);
   System.out.println("Born in: " + city + ", " + state);
   
   
   
   }
}
   
   