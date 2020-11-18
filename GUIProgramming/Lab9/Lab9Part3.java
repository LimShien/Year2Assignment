import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Lab9Part3 extends JFrame implements ActionListener
{
    Lab9Part3()
    {
        super("Menu with Listener and shortcuts");

        //create menu bar
        JMenuBar mb =  new JMenuBar();

        //create menu
        JMenu news = new JMenu("News");
        news.setMnemonic('N');

        //create menuItem
        JMenuItem item1 = new JMenuItem("Sport News");
        //shorcut using control + S
        item1.addActionListener(this);
        item1.setAccelerator(KeyStroke.getKeyStroke('S',ActionEvent.CTRL_MASK));

        JMenuItem item2 = new JMenuItem("Media News");
        item2.addActionListener(this);
        //shortcut using control + M
        item2.setAccelerator(KeyStroke.getKeyStroke('M', ActionEvent.CTRL_MASK));

        JMenuItem item3 = new JMenuItem("Weather");
        item3.addActionListener(this);
        //shortcut using control + W
        item3.setAccelerator(KeyStroke.getKeyStroke('W',ActionEvent.CTRL_MASK));

        news.add(item1);
        news.add(item2);
        news.add(item3);

        mb.add(news);
        setJMenuBar(mb);

        setVisible(true);
        setSize(300, 400);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand() == "Sport News")
        {
            JPanel panel1 = new JPanel();

            JLabel label1 = new JLabel(new ImageIcon("pic3.jpg"));
            JTextArea tx = new JTextArea("Arsenal manager Unai Emery said on Wednesday that he hopes the club's supporters get behind the team in Thursday's Europa League match against Eintracht Frankfurt after a string of poor results increased pressure on the Spanish manager to deliver.",20,2);

             tx.setLineWrap(true);
            //scrollable text area
            JScrollPane scrollableTextArea1= new JScrollPane(tx);
            scrollableTextArea1.setPreferredSize(new Dimension(200, 50));
            //only have vertical scroll bar
            scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

            panel1.setLayout(new GridLayout(2,1,2,2));
            panel1.add(label1);
            panel1.add(scrollableTextArea1);


            JOptionPane.showMessageDialog(this,panel1,"Sport News",JOptionPane.INFORMATION_MESSAGE);

        }

        else if(e.getActionCommand() == "Media News")
        {
            JPanel panel2 = new JPanel();

            JLabel label2 = new JLabel(new ImageIcon("pic4.jpg"));

            JTextArea tx2 = new JTextArea("Netflix and Facebook could contribute more, says BAI chair Online media platforms like Netflix and Facebook could make greater contributions either financially or in programming to the country's broadcasting sector, the Broadcasting Authority of Ireland (BAI) has suggested.",20,2);

            tx2.setLineWrap(true);
            //scrollable text area
            JScrollPane scrollableTextArea2= new JScrollPane(tx2);
            scrollableTextArea2.setPreferredSize(new Dimension(200, 50));
            //only have vertical scroll bar
            scrollableTextArea2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollableTextArea2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

            panel2.setLayout(new GridLayout(2,1,2,2));

            panel2.add(label2);
            panel2.add(scrollableTextArea2);


            JOptionPane.showMessageDialog(this,panel2,"Media News",JOptionPane.INFORMATION_MESSAGE);
        }

        else if(e.getActionCommand() == "Weather")
        {
            JPanel panel3 = new JPanel();
            JTextArea tx3 = new JTextArea("Generally cloudy but some bright or sunny spells will break through. Highest temperatures 8 to 10 degrees in light to moderate northerly winds. /n Cloudy and mainly dry for much of the country tonight with just the odd shower. Winds will be light allowing some mist and fog patches to form. Lowest temperatures 2 to 6 degrees with grass frost possible in any clear spells.",20,2);

            JLabel label3 = new JLabel(new ImageIcon("pic5.jpg"));
            tx3.setLineWrap(true);
            //scrollable text area
            JScrollPane scrollableTextArea3= new JScrollPane(tx3);
            scrollableTextArea3.setPreferredSize(new Dimension(200, 50));
            //only have vertical scroll bar
            scrollableTextArea3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollableTextArea3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

            panel3.setLayout(new GridLayout(2, 1, 2, 2));
            panel3.add(label3);
            panel3.add(scrollableTextArea3);
            JOptionPane.showMessageDialog(this , panel3, "Weather", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String [] args)
    {
        Lab9Part3 demo = new Lab9Part3();
    }
}