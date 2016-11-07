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
    String action = askAQuestion("Do you want to 'stop' or '" + "continue' walking?");
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
    String input = askAQuestion("Do you want to 'pet' it or 'kill' it?");;
    if ("kill".equalsIgnoreCase(input))
    {
      killAnimal(input);
    }
    else if ("pet".equalsIgnoreCase(input))
    {
      petAnimal(input);
    }
    else
    {
      endStory();
    }
  }
  private static void killAnimal(String input)
  {
    MessageBox.showMessage(
        "You've killed the strange animal. You have found an artifact covered in animal's dust. You should feel ashamed.");
    input = askAQuestion("Do you wish to 'take' or 'leave' the artifact?");
    if ("take".equalsIgnoreCase(input))
    {
      MessageBox
          .showMessage("You wake up remembering about your poor dog that had died yesterday from old age...");
      MessageBox.showMessage("But... YOU killed it... The End");
    }
    else if ("leave".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("You go insane, knowing you killed your bestfriend, Snowball the Dog.");
      MessageBox.showMessage("The End =)");
    }
    else
    {
      endStory();
    }
  }
  private static void petAnimal(String input)
  {
    MessageBox.showMessage("After you pet the animal, it becomes your friend. It gives you an artifact.");
    input = askAQuestion("Do you 'accept' the gift or 'deny' it?");
    if ("accept".equalsIgnoreCase(input))
    {
      MessageBox.showMessage(
          "You wake up with your pet dog prancing on your bed. You make sure that your pet is FOREVER safe! <3 The End.");
    }
    else if ("deny".equalsIgnoreCase(input))
    {
      MessageBox.showMessage(
          "You wake up and your dog it not at your bedside. Your dog sadly ran away, leaving to never come back. </3 The End.");
    }
    else
    {
      endStory();
    }
  }
  private static void endStory()
  {
    MessageBox.showMessage("You went off the path. You fall into the emptiness. The End.");
  }
  private static void stopWalking()
  {
    MessageBox.showMessage("You wake up with your pet cat. The End.");
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Whites.Snow;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.darken(color);
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
