package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToThickHexagonMultiColor
{
  // ----Kata Question----
  // How would you make an equilateral hexagon...
  // with 20 pixels thick sides?
  // with multi-colored lines?
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
    // Change the number of sides to 6
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      // Change the color of the line to multicolor      
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
  }
}