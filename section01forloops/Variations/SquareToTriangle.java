package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToTriangle
{
  //-----Kata Question-----
  //How would you make an equilateral triangle?
  //Write out steps in English
  //Then translate the steps into code
  //Make sure to run after each line
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Valerie and Katie");
    VirtualProctor.setClassName("Palm Digital");
    Tortoise.show();
    Tortoise.setSpeed(5);
    int sides = 3;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
  }
}
