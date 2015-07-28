/**
 * Write a description of class Rockpaperscissors here.
 * 
 * @author (Sam Siegmeister) 
 * @version (11/20/2012)
 */
import java.util.*;
public class Rockpaperscissors
{
    public static void main(String[]args)
    {
    int rock, paper, scissors, choice, move, wincount, losecount, tiecount;
    String choice2;
    wincount=0;
    losecount=0;
    tiecount=0;
    rock=0;
    paper=1;
    scissors=2;
    boolean play=true;
    
    Scanner scan = new Scanner (System.in);
    Random generator = new Random();
    move = generator.nextInt(3);
    
    
    
    while(play == true)
{
    System.out.println("Select \"0\" for rock,\"1\" for paper, or \"2\" for scissors. (\"3\" to quit)");
    choice = scan.nextInt();
    move = generator.nextInt(3);

    if (choice == rock)
    
        if(move==0)
        {
        System.out.println("You selecteds rock. The computer selected rock. You tied.");
        tiecount++;
        }
    
        else if(move==1)
        {
        System.out.println("You selecteds rock. The computer selected paper. You lose.");
        losecount++;
        }
    
        else if(move==2)
        {
        System.out.println("You selecteds rock. The computer selected scissors. You win.");
        wincount++;
        };
 if (choice == scissors)
    
        if(move==0)
        {
        System.out.println("You selecteds scissors. The computer selected rock. You lose.");
        losecount++;
        }
     
        else if(move==1)
        {
        System.out.println("You selecteds scissors. The computer selected paper. You win.");
        wincount++;
        }
        
        else if(move==2)
        {
        System.out.println("You selecteds scissors. The computer selected scissors. You tied.");
        tiecount++;
        };
 if (choice == paper)
    
        if(move==0)
        {
        System.out.println("You selecteds paper. The computer selected rock. You win.");
        wincount++;
        }
    
        else if(move==1)
        {
        System.out.println("You selecteds paper. The computer selected paper. You tied.");
        tiecount++;
        }
    
        else if(move==2)
        {
        System.out.println("You selecteds paper. The computer selected scissors. You lose.");
        losecount++;
        };
if (choice == 3)
{
 System.out.println("Wins:"+wincount+" Losses:"+losecount+" Ties:"+tiecount);
 play = false;
}
else
{
 play = true;
}
 }
        }
    }
    