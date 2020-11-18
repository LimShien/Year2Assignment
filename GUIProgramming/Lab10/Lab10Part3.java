
import javax.swing.*;
import java.awt.*;

public class Lab10Part3 extends JFrame
{
    public void paint(Graphics g)
    {
        super.paint(g);


        //the color of the boat can be set using parameter
        boat(g, Color.GRAY, Color.GREEN);


    }

    //method to draw boats
    public void boat(Graphics g, Color firstBoat, Color secondBoat)
    {
        int[] x = {100,199,200,250,200,201,300,275,125};
        int[] y = {150,150, 100,80, 60,150,150,230,230};

        int [] y2 = new int[y.length];

        //second boat with different Y axis
        for(int i=0; i < y2.length; i++)
        {
            y2[i] = y[i]+300;
        }


        g.setColor(firstBoat);
        g.fillPolygon(x,y,x.length);

        g.setColor(secondBoat);
        g.fillPolygon(x,y2,x.length);


    }

    Lab10Part3()
    {

        setVisible(true);
        setSize(500, 700);
    }

    public static void main(String[] args)
    {
        Lab10Part3 demo = new Lab10Part3();

    }
}