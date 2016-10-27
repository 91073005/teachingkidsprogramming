package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;
//------------- Kata Question -----------------//
// Where do you see duplicate lines of code?
//  and how can you refactor to make this code more readable?
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
//
//------------- Kata Question -----------------//
//Where do you see duplicate lines of code?
//and how can you refactor to make this code more readable?
//Write out the steps in English
//Then translate the steps into code
//Make sure to run after each line
//------------- Kata Question -----------------//
//Where do you see duplicate lines of code?
//and how can you refactor to make this code more readable?
//Write out the steps in English
//Then translate the steps into code
//Make sure to run after each line
//------------- Kata Question -----------------//
//Where do you see duplicate lines of code?
//and how can you refactor to make this code more readable?
//Write out the steps in English
//Then translate the steps into code
//Make sure to run after each line

// Be aware: this is an example of too much refactoring, i.e. after
// we're done it will be less readable than before, That's bad
public class PyramidsOfGizaRemoveEvenMoreDuplication_04
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Valerie and Katie");
    setUpPyramidLand();
    // Bad refactoring
    int[][] degreesAndLength = {{-90, 220},
                                {135, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {-90, 100},
                                {90, 100},
                                {135, 210}};
    for (int[] i : degreesAndLength)
    {
      Tortoise.turn(i[0]);
      Tortoise.move(i[1]);
    }
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.AliceBlue);
    Tortoise.setPenColor(PenColors.Yellows.DarkGoldenrod);
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
