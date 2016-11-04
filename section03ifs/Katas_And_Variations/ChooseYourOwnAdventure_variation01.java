package org.teachingkidsprogramming.section03ifs.Katas_And_Variations;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure_variation01
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One day you were walking into a blank void");
    animateStartStory();
    String action = askAQuestion("Do you want to 'stop' or 'continue' walking?");
    if ("stop".equalsIgnoreCase(action))
    {
      stopWalking();
    }
    else if ("continue".equalsIgnoreCase(action))
    {
      continueWalking();
    }
    else
    {
      endStory();
    }
  }
  private static void continueWalking()
  {
    MessageBox.showMessage("You meet with a strange animal.");
    String input = askAQuestion("Do you want to 'backyard' or 'toilet'?");;
    if ("toilet".equalsIgnoreCase(input))
    {
      pourIntoToilet(input);
    }
    else if ("backyard".equalsIgnoreCase(input))
    {
      pourIntoBackyard(input);
    }
    else
    {
      endStory();
    }
  }
  private static void pourIntoBackyard(String input)
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    input = askAQuestion("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
    if ("faint".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("You made a delicious soup! Yum! The end.");
    }
    else if ("scream".equalsIgnoreCase(input))
    {
      startStory();
    }
    else
    {
      endStory();
    }
  }
  private static void pourIntoToilet(String input)
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
    input = askAQuestion("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
    if ("Yes".equalsIgnoreCase(input))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else if ("HECK YES".equalsIgnoreCase(input))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else
    {
      endStory();
    }
  }
  private static void endStory()
  {
    MessageBox.showMessage("You don't know how to read directions. You can't play this game. THE END.");
  }
  private static void stopWalking()
  {
    MessageBox.showMessage("You wake up and have a boring day. THE END.");
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
