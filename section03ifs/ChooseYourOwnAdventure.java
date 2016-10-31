package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise woke up in a dream.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'wake up' or 'explore' the dream?");
    if ("wake up".equalsIgnoreCase(action))
    {
      wakeUp();
    }
    else if ("explore".equalsIgnoreCase(action))
    {
      approachOoze();
    }
    else
    {
      endStory();
    }
  }
  private static void approachOoze()
  {
    MessageBox.showMessage(
        "You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
    String input = askAQuestion("Do you want to pour the ooze into the 'backyard' or 'toilet'?");;
    if (input == "toilet")
    {
      //            pourIntoToilet (recipe below) --#12.1
      pourIntoToilet(input);
    }
    //         Otherwise, if they answer "backyard" --#8.2
    else if (input == "backyard")
    {
      //            pourIntoBackyard (recipe below) --#19.1
      //            ------------- Recipe for pourIntoBackyard --#19.2
      //                Tell the user "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water." --#17
      MessageBox.showMessage(
          "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
      //                Ask the user "As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?" --#18
      //                If they answer "faint" --#20.1
      //                        Tell the user "You made a delicious soup! Yum! The end." --#21
      //                Otherwise, if they answer "scream" --#20.2
      //                    startStory --#22
      //                Otherwise, if they answer anything else --#20.3
      //                    endStory --#23
      //         ------------- End of pourIntoBackyard recipe --#19.3
    }
    //         Otherwise, if they answer anything else --#8.3
    else if (input == random)
    {
      endStory();
    }
  }
  private static void pourIntoToilet(String input)
  {
    //            ------------- Recipe for pourIntoToilet --#12.2
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
    MessageBox.askForTextInput("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
    //               If they answer "yes" --#13.1
    if (input == "Yes")
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    //               Otherwise, if they answer "heck yes" --#13.2
    else if (input == "HECK YES")
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    //               Otherwise, if they answer anything else --#13.3
    else if (input == null)
    {
      endStory();
    }
    //            ------------- End of pourIntoToilet recipe --#12.3
  }
  private static void endStory()
  {
    MessageBox.showMessage("You don't know how to read directions. You can't play this game. THE END.");
  }
  private static void wakeUp()
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
