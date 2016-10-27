package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToIncreasingThickHexagonMultiColor
{
  // ----Kata Question----
  // How would you make an hexagon...
  // with 20 pixels thick sides?
  // with multi-colored lines?
  // and with side lengths of 25 that increase by 2 times?
  // Write out steps in English
  // Then translate the steps into code
  // Make sure to run after each line
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Valerie and Katie");
    VirtualProctor.setClassName("Palm Digital");
    Tortoise.setPenWidth(20);
    Tortoise.show();
    Tortoise.setSpeed(5);
    // Make a variable named length
    int length = 8;
    // Change number of sides to 6
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      // Change the color of the line to multicolor      
      Tortoise.setPenColor(PenColors.getRandomColor());
      // Start side length at 25 pixels
      // Multiply by 2
      length = length * 2;
      Tortoise.move(length);
      Tortoise.turn(360 / sides);
    }
  }
}