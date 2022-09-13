import java.io.*;   //contains all the classes required for input and output operations.

//This program creates a list of songs for a CD by reading from a file.

public class PopSongs
{
   public static void main(String[] args)throws IOException
   {
      FileReader file = new FileReader("PopSongs.txt");
      BufferedReader input = new BufferedReader(file);
      String title;
      String artist;

      // Declare an array of Song objects, called cd,
      // with a size of 6.
      Song[] cd = new Song [6];

      for (int i = 0; i < cd.length; i++)
      {
         title = input.readLine();
         artist = input.readLine();

         // Fill the array by creating a new song with
         // the title and artist and storing it in the
         // appropriate position in the array.
         cd[i] = new Song(title, artist);
      }

      System.out.println();
      System.out.println("Contents of PopSongs:");
      System.out.println("*********************");
      for (int i = 0; i < cd.length; i++)
      {
         // Print the contents of the array to the console.
         System.out.print(cd[i]);
      }
   }
}