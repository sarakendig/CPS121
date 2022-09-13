import java.io.*;            // Needed for File I/O classes
import java.util.Scanner;   // Needed for the Scanner class

/**
   The SecretMessage class processes the tokens in
   a text file in order to decode a secret message.
*/

public class SecretMessage 
{
   public static void main(String[] args)throws IOException
   {
      // Open the secret.txt file.
      File file = new File("secret.txt");
      Scanner inputFile = new Scanner(file);

      String fileContents=""; // To hold the file contents
      int tokenCount=0;        // To counter the tokens
      char letter;          // To hold a character

      // Create an instance of the StringBuilder object.
      StringBuilder strb = new StringBuilder();

      // Get a line of input from the file.
       while(inputFile.hasNextLine())  
      {  
      fileContents = inputFile.nextLine();  
      }  
      inputFile.close();

      // Close the file.


      // Get the tokens, using a space delimiter.
      String[] tokens = fileContents.split(" ");

      // Process the tokens.
      for (String s : tokens)
      {
         // Determine if the token counter is
         // divisible by 5. Use if expression
           if(tokenCount%5==0)
         {
            // Get the first character in the token,
            // convert it to uppercase, and append it
            // to the string.
            letter = s.charAt(0);
            letter = Character.toUpperCase(letter);
            strb.append(letter);
         }

         // Increment the counter for the next token.
         tokenCount++;
      }

      // Display the secret message.
      System.out.println(strb); 
   }
}