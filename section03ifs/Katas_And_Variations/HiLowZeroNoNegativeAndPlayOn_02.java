package org.teachingkidsprogramming.section03ifs.Katas_And_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

//----------------- Kata Question -----------//
// How would you make sure the guess is NOT zero?
//     and end the game if the guess is zero?
// How would you make sure the guess is NOT a negative number
//     but go to the next turn if the guess is negative?
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
public class HiLowZeroNoNegativeAndPlayOn_02
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer);
    for (int i = 0; i < 2; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      // Check if guess equals 0 -- #1
      else if (guess == 0)
      {
        // Alert user that their guess is less than 1 -- #2
        MessageBox.showMessage("Please do not enter values less than 1");
        // Exit the game -- #3
        System.exit(0);
      }
      // Change "==" to "<=" -- #4
      else if (guess <= 0)
      {
        // Repeat step 2 -- #5
        MessageBox.showMessage("Please do not enter values less than 1");
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
    }
    MessageBox.showMessage("You lost");
  }
}