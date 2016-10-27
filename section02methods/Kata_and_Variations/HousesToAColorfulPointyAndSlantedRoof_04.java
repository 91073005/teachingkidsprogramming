package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class HousesToAColorfulPointyAndSlantedRoof_04
{
  //-------------- Kata Question ----------------
  // How would you make a house with a slanted roof
  //    and a house with a pointy roof
  //    and change the color of the houses?
  // Write out the steps in English
  // Then translate the steps into code
  // Make sure to run after each line
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Valerie and Katie");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    // Make a skyline with pointy roof houses and slanted roof houses:
    // Make a house with a pointy roof and current height -- #1
    drawHousePointyRoof(height);
    // Make a house with a slanted roof and a height of 120 pixels -- #2
    drawHouseSlantedRoof(120);
    // Make a house with a pointy roof and a height of 90 pixels -- #3
    drawHousePointyRoof(90);
    // Make a house with a slanted roof and a height of 20 pixels -- #4 
    drawHouseSlantedRoof(20);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    // Make a colorful skyline of pointy and slanted roofed houses:
    // Set PenColor to get random colors -- #1
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int height)
  {
    // Set PenColor to get random colors -- #2
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawSlantedRoof()
  {
    // Make a slanted roof:
    // Turn the tortoise 45 degrees to the right -- #1
    Tortoise.turn(45);
    // Move the tortoise 30 pixels -- #2
    Tortoise.move(30);
    // Turn the tortoise 135 degrees to the right -- #3
    Tortoise.turn(135);
    // Move the tortoise 20 degrees -- #4
    Tortoise.move(20);
  }
  private static void drawPointyRoof()
  {
    // Make a pointy roof:
    // Turn Tortoise 45 degrees to the right -- #1
    Tortoise.turn(45);
    // Move Tortoise A pixels -- #2
    Tortoise.move(30);
    // Turn Tortoise 90 degrees to the right -- #3
    Tortoise.turn(90);
    // Move tortoise A pixels -- #4
    Tortoise.move(30);
    // Turn Tortoise 45 degrees to the right -- #5
    Tortoise.turn(45);
  }
  private static void drawFlatRoof()
  {
    // make flat roof
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
