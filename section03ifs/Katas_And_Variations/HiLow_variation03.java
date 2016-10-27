package org.teachingkidsprogramming.section03ifs.Katas_And_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_variation03
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(50, 51);
    MessageBox.showMessage("The answer is " + answer);
    int numGuesses = MessageBox.askForNumericalInput("How many guesses do you think you need?");
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number between 50 and 51");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You Win!");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too High!");
      }
      else
      {
        MessageBox.showMessage("Too Low!");
      }
    }
    MessageBox.showMessage("You Lose!");
  }
}
