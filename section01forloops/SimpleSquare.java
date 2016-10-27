package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(5);
    int sides = 10;
    for (int i = 0; i < 4; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(50);
      Tortoise.turn(90);
    }
  }
}
