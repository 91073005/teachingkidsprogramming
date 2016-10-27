package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CompleteSquare
{
  // Use the Tortoise to draw a red square with a width and a height of 40 pixels
  //
  // Write each of the English line comments (use at least 6 line comments)
  //
  // Number each comment line at the end, so your user knows the correct order to translate the code
  //
  // Verify - step one - Translate EACH comment line into Java code
  //
  // Verify - step two - Run your code after each line
  public static void main(String[] args) throws Exception
  {
    // TODO: Write comment and then code here
    // Show the Tortoise - #1
    Tortoise.show();
    // Make the tortoise move as fast as possible - #2
    Tortoise.setSpeed(10);
    // Do the following 4 times - #6.1
    for (int i = 0; i < 4; i++)
    {
      //      Change the pen color of the line that the tortoise draws to red - #5
      Tortoise.setPenColor(PenColors.Reds.Red);
      //      Move the tortoise 40 pixels - #3
      Tortoise.move(40);
      //      Turn the tortoise to the right 90 degrees - #4
      Tortoise.turn(90);
      // Repeat - #6.2
    }
  }
}
