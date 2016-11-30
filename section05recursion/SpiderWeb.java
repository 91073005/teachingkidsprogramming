package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#6
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    //    Change the Tortoise to a Spider --#14
    //    Change the pen color of the line the tortoise draws to red --#13.1
    Tortoise.setPenColor(PenColors.Reds.Red);
    //    Set the color of the background window to black (HINT: use the Tortoise to get the background window) --#13.2
    Tortoise.setBackgroundWindow(PenColors.Grays.Black);
    //    The current zoom is 1.1 --#8.2
    double zoom = 1.1;
    for (int i = 0; i < 10; i++)
    {
      double lengthOfLine = 10.5;
      //
      lengthOfLine = weaveOneLayer(zoom, lengthOfLine);
      //
      //        Change the current zoom so it is multiplied by 1.3 --#11
      zoom = zoom * 1.3;
    }
  }
  private static double weaveOneLayer(double zoom, double lengthOfLine)
  {
    for (int i = 0; i < 6; i++)
    {
      //
      drawTriangle(lengthOfLine);
      //
      Tortoise.turn(360 / 6);
      lengthOfLine = lengthOfLine + zoom;
    }
    return lengthOfLine;
  }
  private static void drawTriangle(double length)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
