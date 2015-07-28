
/**
 * Write a description of class JFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame
{
public Frame()
{
    Game g=new Game();
    setBackground(Color.gray);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(450, 520));
    add(g);
    pack();
}
public static void main (String[] args)
{
    Frame f = new Frame();
}
}
