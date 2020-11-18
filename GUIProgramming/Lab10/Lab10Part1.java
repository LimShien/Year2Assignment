import javax.swing.*;
import java.awt.*;

 public class Lab10Part1 extends JFrame
{
    public void paint(Graphics g)
    {
        super.paint(g);

        //L
        g.drawLine(70, 50, 70, 100);
        g.drawLine(70, 100, 100, 100);

        //H
        g.drawLine(130, 50, 130,100);
        g.drawLine(130, 75, 160,75);
        g.drawLine(160, 50, 160,100);


    }

    Lab10Part1()
    {

        setVisible(true);
        setSize(300, 400);
    }

    public static void main(String[] args)
    {
        Lab10Part1 demo = new Lab10Part1();

    }
}