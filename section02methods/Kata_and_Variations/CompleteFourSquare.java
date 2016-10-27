package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
//------------FourSquare Kata---------------//
//  Use the Tortoise to draw four squares, each with a width and height of 50 pixels
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CompleteFourSquare
{
  public static void main(String[] args)
  {
    System.out.println("be sure to complete the main method to start");
    //TODO: write comments and then code here
    // Show the tortoise -- #1
    Tortoise.show();
    // Set the tortoise speed to as fast as possible -- #2
    Tortoise.setSpeed(10);
    // Do the following 4 times -- #8.1
    for (int i = 0; i < 4; i++)
    {
      // Refactor drawSquare -- #6.1
      drawSquare();
      // Turn tortoise 90 degrees -- #9
      Tortoise.turn(90);
      // Repeat -- #8.2
    }
  }
  private static void drawSquare()
  {
    // Do the following 4 times -- #7.1
    for (int i = 0; i < 4; i++)
    {
      // -- Start of drawSquare --#6.2
      //Set pen color to a random color -- #3
      Tortoise.setPenColor(PenColors.getRandomColor());
      //Move tortoise 50 pixels -- #4
      Tortoise.move(50);
      //Turn tortoise 90 degrees to the right --#5
      Tortoise.turn(90);
      // -- End of drawSquare -- #6.3
      // Repeat -- #7.2
    }
  }
}