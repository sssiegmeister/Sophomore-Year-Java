
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.Timer;
import java.awt.event.ActionListener;
public class Game extends JPanel implements MouseListener
{
CPU one=new CPU("easy");
CPU two=new CPU("easy");
JButton blue=new JButton("Blue");
JButton green=new JButton("Green");
JButton white=new JButton("White");
JButton black=new JButton("Black");
JButton red=new JButton("Red");
JButton orange=new JButton("Orange");
JButton yellow=new JButton("Yellow");
public Game()
{
    //add(blue);
    //add(green);
    //add(white);
    //add(black);
    //add(red);
    //add(orange);
    //add(yellow);
}
public void paint (Graphics page)
{
    page.setColor(Color.blue);
    page.fillRect(0,0,300,500);
    page.setColor(Color.black);
    page.drawRect(0,0,160,35);
    int x=10, y=10;
    Board b=new Board();
    for (int row=0; row<16; row++)//establishes initial board
    {
    x=10;
    for (int col=0; col<5; col++)
    {
    if(b.getVal(row, col)==0)
    {
    page.setColor(Color.black);
    page.drawOval(x, y, 20, 20);
    }
    x+=30;
    }
    y+=30;
    }
    int ySaved=y-30;
    y=40;
    x=160;
    for (int row=0; row<15; row++)//draws correctness panel
    {
    x=160;
    {
    for (int col=0; col<5; col++)
    {
    if(b.getCorrect(row,col)==0)
    {
    page.setColor(Color.black);
    page.drawOval(x,y,10,10);
    }
    x+=30;
    }
    y+=30;
    }
    } 
    x=10;
    y=10;
    b.play(one, 0);
    for(int col=0; col<5; col++)//mastermind generates sequence
    {
    if(b.getVal(0, col)==0)
    {
    page.setColor(Color.black);
    page.drawOval(x, y, 20, 20);
    }
    if(b.getVal(0, col)==1)
    {
    page.setColor(Color.cyan);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(0, col)==2)
    {
    page.setColor(Color.green);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(0, col)==3)
    {
    page.setColor(Color.white);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(0, col)==4)
    {
    page.setColor(Color.black);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(0, col)==5)
    {
    page.setColor(Color.red);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(0, col)==6)
    {
    page.setColor(Color.orange);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(0, col)==7)
    {
    page.setColor(Color.yellow);
    page.fillOval(x, y, 20, 20);
    }
    x+=30;
    }
    page.setColor(Color.black);
    //page.fillRect(0,0,160,35);
    y=ySaved;
    for(int cur=15; cur>0; cur--)//makes the cpu moves one easy
    {
    x=10;
    b.play(two, cur);
    for(int col=0; col<5; col++)
    {   
    if(b.getVal(cur, col)==0)
    {
    page.setColor(Color.black);
    page.drawOval(x, y, 20, 20);
    }
    if(b.getVal(cur, col)==1)
    {
    page.setColor(Color.cyan);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(cur, col)==2)
    {
    page.setColor(Color.green);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(cur, col)==3)
    {
    page.setColor(Color.white);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(cur, col)==4)
    {
    page.setColor(Color.black);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(cur, col)==5)
    {
    page.setColor(Color.red);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(cur, col)==6)
    {
    page.setColor(Color.orange);
    page.fillOval(x, y, 20, 20);
    }
    if(b.getVal(cur, col)==7)
    {
    page.setColor(Color.yellow);
    page.fillOval(x, y, 20, 20);
    } 
    b.setCorrect(cur, col);
    if(b.getCorrect(cur, col)==1)
    {page.setColor(Color.black);
     page.fillOval(x+150, y, 10, 10);}
    if(b.getCorrect(cur, col)==2)
    {page.setColor(Color.white);
     page.fillOval(x+150, y, 10, 10);}
    x+=30;
    }
    y-=30;
    }
}

public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void mouseClicked(MouseEvent e) {}
}
