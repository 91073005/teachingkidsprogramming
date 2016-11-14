package org.teachingkidsprogramming.section04mastery.Katas_And_Variations;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DigiFlower_Variation01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setColor(PenColors.Grays.Silver);
    Tortoise.setPenWidth(10);
    for (int i = 0; i < 20; i++)
    {
      Tortoise.turn(360 / 3);
      createColorPalette();
      drawOctogon();
    }
  }
  private static void drawOctogon()
  {
    for (int i = 0; i < 10; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(52);
    }
  }
  private static void createColorPalette()
  {
    Color color1 = PenColors.Blues.DarkBlue;
    Color color2 = PenColors.Greens.Chartreuse;
    Color color3 = PenColors.Purples.Indigo;
    Color color4 = PenColors.Blues.LightSkyBlue;
    ColorWheel.addColor(color1);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color1);
  }
}
