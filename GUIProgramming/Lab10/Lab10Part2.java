import javax.swing.*;
import java.awt.*;

public class Lab10Part2 extends JFrame
{
    public void paint(Graphics g)
    {
        super.paint(g);

        g.setColor(Color.GREEN);
        g.fillArc(130,110, 300, 300, 90, 36);
        int x = 250;
        int y = 200;


        g.setColor(Color.BLACK);

             g.drawOval(x,y,20,20);











    }

    Lab10Part2()
    {

        setVisible(true);
        setSize(500, 500);
    }

    public static void main(String[] args)
    {
        Lab10Part2 demo = new Lab10Part2();

    }
}