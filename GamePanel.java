
/**
 * Write a description of class GamePanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GamePanel extends JPanel
{
   private final int SIZE = 20;  // radius of each dot
   //Board b = new Board(0);
   //private ArrayList<Point> pointList;
   final int MAXROWS = 9;
   final int MAXCOLS = 9;
   int move;
   int player1 = 1;
   int player2 = 2;
   private int difficulty1;
   private int difficulty2;
   Board b;
   GamePanel myGp;
   boolean myTurn = true;
   
   JLabel winner=new JLabel("Player has winned");
   
   JButton one=new JButton("");
   JButton two=new JButton("");
   JButton three=new JButton("");
   JButton four=new JButton("");
   JButton five=new JButton("");
   JButton six=new JButton("");
   JButton seven=new JButton("");
   
   public GamePanel()
   {
      myGp = this;
      setLayout(null);
      b = new Board();
      GameListener a=new GameListener();
      one.setBounds(40, 340, 40, 40);
      two.setBounds(80, 340, 40, 40);
      three.setBounds(120, 340, 40, 40);
      four.setBounds(160, 340, 40, 40);
      five.setBounds(200, 340, 40, 40);
      six.setBounds(240, 340, 40, 40);
      seven.setBounds(280, 340, 40, 40);
      one.addActionListener(a);
      add(one);
      two.addActionListener(a);
      add(two);
      three.addActionListener(a);
      add(three);
      four.addActionListener(a);
      add(four);
      five.addActionListener(a);
      add(five);
      six.addActionListener(a);
      add(six);
      seven.addActionListener(a);
      add(seven);
      setBackground (Color.blue);
      setPreferredSize (new Dimension(600, 400));
      
      
   }
   public void level1(int d1)
   {
       difficulty1 = d1;
       //System.out.println("Now set p1 difficulty level: "+d1);
    }
   public void level2(int d2)
   {
       difficulty2 = d2;
       //System.out.println("Now set p2 difficulty level: "+d2);
    }
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
      page.setColor (Color.black);
      
      for (int r = 2; r < MAXROWS-1; r++)
      {
          for (int c = 1; c < MAXCOLS-1; c++)
          {
         if(b.getPoint(r, c) == 1)
         {
             page.setColor (Color.red);
            }
         else if(b.getPoint(r, c) == 2)
         {
             page.setColor (Color.yellow);
            }
         else
         {
             page.setColor (Color.black);
            }
            page.fillOval (c * 40, r * 40, SIZE*2, SIZE*2);
    }
   }
}
   private class GameListener implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
           if(e.getSource().equals(one))
           move=1;
           if(e.getSource().equals(two))
           move=2;
           if(e.getSource().equals(three))
           move=3;
           if(e.getSource().equals(four))
           move=4;
           if(e.getSource().equals(five))
           move=5;
           if(e.getSource().equals(six))
           move=6;
           if(e.getSource().equals(seven))
           move=7;
           if (b.getPlay() == true)
           {
           if (myTurn == true)
           {
           if(difficulty1 == 4)
           {
           //b.chooseMoveGraphics(difficulty1, difficulty2, move);
           b.makeMove(move, player1);
           repaint();
           myTurn = !myTurn;
        }
        else
        {
           b.chooseMoveGraphics1(difficulty1, move, player1);
           //b.makeMove(move, player1);
           repaint();
           myTurn = !myTurn;
        }
        }
           else
           {
           if (difficulty2 == 4)
           {
               //b.chooseMoveGraphics(difficulty1, difficulty2, move);
           b.makeMove(move, player2);
           repaint();
           myTurn = !myTurn;
        }
        else
        {
           b.chooseMoveGraphics2(difficulty2, move, player2);
           //b.makeMove(move, player2);
           repaint();
           myTurn = !myTurn;
        }
        }
    }
   }
}
}