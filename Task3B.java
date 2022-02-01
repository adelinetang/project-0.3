//Adeline Tang
//CS1400
//Assignment 3
//9/23/2021

/**
   This program demonstrates the Switch loop.
*/
import java.util.Scanner;

public class Task3B
{
   public static void main(String [] args)
   {
      int tracks;   // A number entered by the user.

      //Get a number from the user.
      System.out.println("Enter the number of tracks purchased this month: ");
      Scanner keyboard = new Scanner (System.in);
      tracks = keyboard.nextInt();

      //Determine the number entered.
      switch(tracks)
      {
         case 0: 
            System.out.println("You have 0 points");
            break;
         case 1: 
            System.out.println("You have 20 points");
            break;
         case 2:
            System.out.println("You have 40 points");
            break; 
         case 3:
            System.out.println("You have 60 points");
            break; 
         default:
            System.out.println("You have 100 points");
            break;
      }
   }
}
//testing testing