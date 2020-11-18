import javax.swing.*;
import java.awt.*;

class Lab9Part4 extends JFrame
{

    int result1,result2, result3 = 0;
    Lab9Part4()
    {
        super("Adventure Game");


        while(result3 == 0)
        {
            buildInitialGameOption();   //return result1(int)
            buildSecondGameOption();    //return result2(int)
            buildEndGame();
        }

        setVisible(true);
        setSize(300, 400);
    }

    public int buildInitialGameOption()
    {
        Object[] options = {"Door1","Door2","Door3"};
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(1,3));

        JLabel label = new JLabel("Choose a door!", JLabel.LEFT);

        JLabel label1 = new JLabel(new ImageIcon("door.jpg"));

        JLabel label2 = new JLabel(new ImageIcon("door.jpg"));

        JLabel label3 = new JLabel(new ImageIcon("door.jpg"));


        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.Y_AXIS));
        displayPanel.add(label);
        displayPanel.add(panel);


        result1 = JOptionPane.showOptionDialog(this,
                                               displayPanel, //message
                                                  "choice", //title
                                                  JOptionPane.YES_NO_CANCEL_OPTION,
                                                  JOptionPane.PLAIN_MESSAGE,
                                                  null,//icon
                                                  options, //possible choice
                                                  null); //default selection

        return result1;

    }
    public void buildSecondGameOption()
    {
        if(result1 == 0)
        {
            buildFirstPath();
        }
        else if(result1 == 1)
        {
            buildSecondPath();
        }
        else
        {
            buildThirdPath();
        }

    }

    public int buildFirstPath()
    {

        Object[] options = {"Red", "Blue"};
        result2 = JOptionPane.showOptionDialog(this,
                                                "Do you cut the red wire or the blue one?",
                                                "firstPath",
                                                JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE,
                                                new ImageIcon("bomb.jpg"),
                                                options,
                                                null);
         return result2;
    }
    public int buildSecondPath()
    {
        Object[] options = {"MEWTWO", "GENGAR"};
        result2 = JOptionPane.showOptionDialog(this,
                                               "Which Pokemon is Stronger?",
                                               "SecondPath",
                                                JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE,
                                                new ImageIcon("poke.png"),
                                                options,
                                                null);
         return result2;
    }
    public int buildThirdPath()
    {
        Object[] options = {"Yes", "No"};
        result2 = JOptionPane.showConfirmDialog(this,
                                                "an air pod on the floor. Pick it up?",
                                                "ThirdPath",
                                                JOptionPane.YES_NO_OPTION);
         return result2;
    }

    public void buildEndGame()
    {
        Object[] options = {"Retry", "Byebye ;)"};


        if(result1 == 0 && result2 == 1)
        {
            result3 = JOptionPane.showOptionDialog(this,
                                          "Booooooom.....Game Over",
                                          "end of game",
                                          JOptionPane.YES_NO_OPTION,
                                          JOptionPane.QUESTION_MESSAGE,
                                          new ImageIcon("lose.png"),
                                          options,
                                          null);
        }
        else if (result1 == 1 && result2 == 1)
        {
            result3 = JOptionPane.showOptionDialog(this,
                                              "Gengar is fainted. GameOver",
                                              "end of game",
                                              JOptionPane.YES_NO_OPTION,
                                              JOptionPane.QUESTION_MESSAGE,
                                              new ImageIcon("lose.png"),
                                              options,
                                              null);
        }

        else if(result1 == 2 && result2 == 1)
        {
                result3 = JOptionPane.showOptionDialog(this,
                                              "Nothing Happened. Byè",
                                              "end of game",
                                              JOptionPane.YES_NO_OPTION,
                                              JOptionPane.QUESTION_MESSAGE,
                                              new ImageIcon("lose.png"),
                                              options,
                                              null);
        }

        else
        {
            result3 = JOptionPane.showOptionDialog(this,
                                              "You Winnnn!!! congraz !",
                                              "end of game",
                                              JOptionPane.YES_NO_OPTION,
                                              JOptionPane.QUESTION_MESSAGE,
                                              new ImageIcon("win.jpg"),
                                              options,
                                              null);


        }



    }

    public static void main(String [] args)
    {
        Lab9Part4 demo = new Lab9Part4();
    }

}