import javax.swing.*;
import java.awt.*;

public class Lab10Part4 extends JFrame
{
    public void paint(Graphics g)
    {
        super.paint(g);


        //chasis


        int x[] = {250, 200, 200, 210, 250, 250,200,210,350,500, 470,460,470,225, 250, 275};
        int y[] = {200, 230, 240, 230, 225, 230, 300,370,370,370,320, 320, 350,300, 250, 200};

        int [] x2 = new int[x.length];
        int [] y2 = new int[y.length];

        for(int i = 0; i < x.length ; i ++)
        {
            x2[i] = x[i]+ 50;
        }
         for(int j = 0; j < y.length  ; j ++)
        {
             y2[j] = y[j]- 20;
        }

        g.setColor(Color.GRAY);
        g.fillPolygon(x2,y2,x.length);

        //chair in between chasis
                int [] x3 = {225,225,275, 275,330, 280, 280};
                int [] y3 = {300,230,210, 280, 280,320,320};

                 for(int i = 0; i < x3.length ; i ++)
                        {
                            x3[i] += 24;
                        }
                         for(int j = 0; j < y3.length  ; j ++)
                        {
                             y3[j] += 10;
                }


                g.setColor(Color.ORANGE);

                g.fillPolygon(x3,y3,x3.length);

                g.setColor(Color.BLACK);

                g.drawString("SIT HERE", 250,270);


        g.setColor(Color.RED);
        g.fillPolygon(x,y,x.length);








        g.setColor(Color.BLACK);
        //sleigh blades
        g.drawArc(190,380,20,20,270,-180);
        g.drawLine(200,400,500,400);
        g.drawLine(350,400,350,370);
        g.drawArc(468,340,60,60,270,200);

        //x += 50, y -=20
        g.drawArc(240,360,20,20,270,-110);
        g.drawLine(250,380,550,380);
        g.drawLine(400,380,400,370);
        g.drawArc(518,320,60,60,270,200);

    }

    Lab10Part4()
    {

        setVisible(true);
        setSize(800, 800);
    }

    public static void main(String[] args)
    {
        Lab10Part4 demo = new Lab10Part4();

    }
}