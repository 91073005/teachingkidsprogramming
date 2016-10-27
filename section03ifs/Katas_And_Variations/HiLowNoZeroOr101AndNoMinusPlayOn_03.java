package org.teachingkidsprogramming.section03ifs.Katas_And_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
//----------------- Kata Question -----------//
// How would you make sure the guess is NOT zero?
//     and end the game if the guess is zero?
// How would you make sure the guess is NOT a negative number
//     but go to the next turn if the guess is negative?
// How would you make sure the guess is less than 100
//     and end the game if the guess is greater than 100?
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line

public class HiLowNoZeroOr101AndNoMinusPlayOn_03
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
      // Check if guess is greater than 100 -- #1
      else if (guess > 100)
      {
        // Alert user that their guess is greater than 100 -- #2
        MessageBox.showMessage("Please do not enter values greater than 100");
        // Exit the game -- #3
        System.exit(0);
      }
      else if (guess == 0)
      {
        MessageBox.showMessage("Please do not enter values less than 1");
        System.exit(0);
      }
      else if (guess <= 0)
      {
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