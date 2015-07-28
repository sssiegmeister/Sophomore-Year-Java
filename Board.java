
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.*;
public class Board
{
    Scanner scan = new Scanner (System.in);
    final int empty = 0;
    final int red = 1;
    final int yellow = 2;
    int numCols=9;
    int numRows=9;
    int numRows2=numRows-2;
    int numRows3;
    int selection;
    int player1 = 1;
    int player2 = 2;
    boolean turn = true;
    boolean play = true;
    int difficulty1;
    int difficulty2;
    int FOUND1;
    int FOUND2;
    int lastMove;
    int count=0;
    int winner;
    
    int myBoard[][] = new int[numRows][numCols];
    public Board()
    {
        //difficulty = myDifficulty;
        makeBoard();
        /*for (int r=0; r < numRows; r++)
        {
            for (int c=0; c < numCols; c++)
            {
                myBoard[r][c] = 0;
            }
            //System.out.println("");
        }*/
        //myBoard[4][2]=1;
        //chooseMove();
    }
    public boolean getTurn()
    {
        return turn;
        }
    public boolean getPlay()
    {
        return play;
    }
    public int getWinner()
    {
        return winner;
    }
    /*public int getDifficulty()
    {
        return difficulty;
        }*/
    public int getPoint(int myRow, int myCol)
    {
        return myBoard[myRow][myCol];
    }
    private boolean valid (int row, int col, int player)
    {
      boolean result = false;
          
         if (myBoard[row][col-1] == player||myBoard[row][col+1] == player||myBoard[row-1][col] == player||myBoard[row+1][col] == player||myBoard[row-1][col-1] == player||myBoard[row+1][col+1] == player||myBoard[row-1][col+1] == player||myBoard[row+1][col-1] == player)
            result = true;
      return result;
    }
    public int search(int row, int col, int myPlayer)
    {
        if (myBoard[row][col]==myPlayer)
        {
            if (myBoard[row][col+1]==myPlayer||myBoard[row][col-1]==myPlayer)
            {
            if (myBoard[row][col+1]==myPlayer)
            {
                FOUND1++;
                if (myBoard[row][col+2]==myPlayer)
                {
                    FOUND1++;
                    if (myBoard[row][col+3]==myPlayer)
                    {
                        FOUND1++;
                    }
                }
            }
            if (myBoard[row][col-1]==myPlayer)
            {
                FOUND1++;
                if (myBoard[row][col-2]==myPlayer)
                {
                    FOUND1++;
                    if (myBoard[row][col-3]==myPlayer)
                    {
                        FOUND1++;
                    }
                }
            }
            }
            if (FOUND1<3)
            {
            FOUND1=0;
            }
            if (myBoard[row+1][col]==myPlayer||myBoard[row-1][col]==myPlayer)
            {
            if (myBoard[row+1][col]==myPlayer)
            {
                FOUND1++;
                if (myBoard[row+2][col]==myPlayer)
                {
                    FOUND1++;
                    if (myBoard[row+3][col]==myPlayer)
                    {
                        FOUND1++;
                    }
                }
            }
            if (myBoard[row-1][col]==myPlayer)
            {
                FOUND1++;
                if (myBoard[row-2][col]==myPlayer)
                {
                    FOUND1++;
                    if (myBoard[row-3][col]==myPlayer)
                    {
                        FOUND1++;
                    }
                }
            }
            }
            if (FOUND1<3)
            {
            FOUND1=0;
            }
            if (myBoard[row+1][col+1]==myPlayer||myBoard[row-1][col-1]==myPlayer)
            {
            if (myBoard[row-1][col-1]==myPlayer)
            {
                FOUND1++;
                if (myBoard[row-2][col-2]==myPlayer)
                {
                    FOUND1++;
                    if (myBoard[row-3][col-3]==myPlayer)
                    {
                        FOUND1++;
                    }
                }
            }
            if (myBoard[row+1][col+1]==myPlayer)
            {
                FOUND1++;
                if (myBoard[row+2][col+2]==myPlayer)
                {
                    FOUND1++;
                    if (myBoard[row+3][col+3]==myPlayer)
                    {
                        FOUND1++;
                    }
                }
            }
            }
            if (FOUND1<3)
            {
            FOUND1=0;
            }
            if (myBoard[row-1][col+1]==myPlayer||myBoard[row+1][col-1]==myPlayer)
            {
            if (myBoard[row-1][col+1]==myPlayer)
            {
                FOUND1++;
                if (myBoard[row-2][col+2]==myPlayer)
                {
                    FOUND1++;
                    if (myBoard[row-3][col+3]==myPlayer)
                    {
                        FOUND1++;
                    }
                }
            }
            if (myBoard[row+1][col-1]==myPlayer)
            {
                FOUND1++;
                if (myBoard[row+2][col-2]==myPlayer)
                {
                    FOUND1++;
                    if (myBoard[row+3][col-3]==myPlayer)
                    {
                        FOUND1++;
                    }
                }
            }
            }
            if (FOUND1<3)
            {
            FOUND1=0;
            }
        }
        return FOUND1;
  }


    public void makeBoard()
    {
    for (int r=0; r < numRows; r++)
        {
            for (int c=0; c < numCols; c++)
            {
                myBoard[r][c] = 0;
            }
            //System.out.println("");
        }
    }
    public void showBoard()
    {
        for (int r=2; r < numRows-1; r++)
        {
            for (int c=1; c < numCols-1; c++)
            {
                System.out.print(" "+getPoint(r, c));
            }
            System.out.println("");
        }
    }
    public void makeMove(int choice, int player)
    {
            numRows2 = numRows-2;
            while(myBoard[numRows2][choice] != 0)
            {
                numRows2--;
            
            if (numRows2==1&&choice<4)
            {
            choice++;
            while(myBoard[numRows2+1][choice]==0)
            {
                numRows2++;
            }
        }
            else if (numRows2==1&&choice>=4)
            {
            choice--;
            while(myBoard[numRows2+1][choice]==0)
            {
                numRows2++;
            }
        }
    }
            //if (numRows2==0&&choice==4)
            //choice+=Math.random();
            myBoard[numRows2][choice] = player;
            search(numRows2, choice, player);
            if (search(numRows2, choice, player) >= 3)
            {
            play = false;
            System.out.println("Player "+player+" wins");
            player = winner;
        }
        numRows3 = numRows2;
        //return numRows2;
}
    public void chooseMove(int myDifficulty1, int myDifficulty2)
    {
       while (play == true)
       {
           if (turn == true)
           {
            if (myDifficulty1 == 0)
            {
                System.out.println("Play is true, it is player 1's turn, difficulty is 0");
                System.out.println("Player 1 will now move");
                Random generator = new Random();
                selection = generator.nextInt(7)+1;
                makeMove(selection, player1);
                showBoard();
                turn = false;
            }
            else if(myDifficulty1 == 1)
       {
           System.out.println("Play is true, it is player 1's turn, difficulty is 1");
           System.out.println("Now the opponent will make their move");
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           //makeMove(selection, player2);
           if (count == 0)
           {
           makeMove(selection, player1);
           showBoard();
           System.out.println("Now it is your turn");
           count++;
           turn = false;
        }
        else
        {
           while(valid(numRows3, selection, player1)!=true)
           {
              selection = generator.nextInt(7)+1;
        }
        makeMove(selection, player1);
        showBoard();
        System.out.println("Now it is your turn");
        turn = false;
    }
    }
    else if(myDifficulty1 == 2)
       {
           System.out.println("Play is true, it is player 1's turn, difficulty is 2");
           System.out.println("Now the opponent will make their move");
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           //makeMove(selection, player2);
           if (count == 0)
           {
           makeMove(selection, player1);
           showBoard();
           System.out.println("Now it is your turn");
           count++;
           turn = false;
        }
        else
        {
           while(valid(numRows3, selection, player1)!=true||valid(numRows3, selection, player2)!=true)
           {
              selection = generator.nextInt(7)+1;
        }
        makeMove(selection, player1);
        showBoard();
        System.out.println("Now it is your turn");
        turn = false;
    }
    }
    else if(myDifficulty1 == 3)
       {
           System.out.println("Play is true, it is player 1's turn, difficulty is 3");
           System.out.println("Now the opponent will make their move");
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           //makeMove(selection, player2);
           if (count == 0)
           {
           makeMove(selection, player1);
           showBoard();
           System.out.println("Now it is your turn");
           count++;
           turn = false;
        }
        else
        {
           while(valid(numRows3, selection, player1)!=true&&valid(numRows3, selection, player2)!=true)
           {
              selection = generator.nextInt(7)+1;
        }
        makeMove(selection, player1);
        showBoard();
        System.out.println("Now it is your turn");
        turn = false;
    }
    }
            else if(myDifficulty1 == 4)
            {
            System.out.println("Play is true, it is player 1's turn, difficulty is 4");
            System.out.println("Player 1 will now move");
            System.out.print("Select your column: ");
            selection = scan.nextInt();
            makeMove(selection, player1);
            showBoard();
            //gp.repaint();
            turn = false;
        }
    }
        else //Player 2's turn
        {
            if(myDifficulty2 == 0)
            {
        System.out.println("Play is true, it is player 2's turn, difficulty is 0");
        System.out.println("Now the opponent will make their move");
        Random generator = new Random();
        selection = generator.nextInt(7)+1;
        makeMove(selection, player2);
        showBoard();
        System.out.println("Now it is your turn");
        turn = true;
    }
       else if(myDifficulty2 == 1)
       {
           System.out.println("Play is true, it is player 2's turn, difficulty is 1");
           System.out.println("Now the opponent will make their move");
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           //makeMove(selection, player2);
           if (count == 0)
           {
           makeMove(selection, player2);
           showBoard();
           System.out.println("Now it is your turn");
           count++;
           turn = !turn;
        }
        else
        {
           while(valid(numRows3, selection, player2)!=true)
           {
              selection = generator.nextInt(7)+1;
        }
        makeMove(selection, player2);
        showBoard();
        System.out.println("Now it is your turn");
        turn = !turn;
    }
    }
    else if(myDifficulty2 == 2)
       {
           System.out.println("Play is true, it is player 2's turn, difficulty is 2");
           System.out.println("Now the opponent will make their move");
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           //makeMove(selection, player2);
           if (count == 0)
           {
           makeMove(selection, player2);
           showBoard();
           System.out.println("Now it is your turn");
           count++;
           turn = !turn;
        }
        else
        {
           while(valid(numRows3, selection, player2)!=true||valid(numRows3, selection, player1)!=true)
           {
              selection = generator.nextInt(7)+1;
        }
        makeMove(selection, player2);
        showBoard();
        System.out.println("Now it is your turn");
        turn = !turn;
    }
    }
    else if(myDifficulty2 == 3)
       {
           System.out.println("Play is true, it is player 2's turn, difficulty is 3");
           System.out.println("Now the opponent will make their move");
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           //makeMove(selection, player2);
           if (count == 0)
           {
           makeMove(selection, player2);
           showBoard();
           System.out.println("Now it is your turn");
           count++;
           turn = true;
        }
        else
        {
           while(valid(numRows3, selection, player2)!=true&&valid(numRows3, selection, player1)!=true)
           {
              selection = generator.nextInt(7)+1;
        }
        makeMove(selection, player2);
        showBoard();
        System.out.println("Now it is your turn");
        turn = true;
    }
    }
    
       else if(myDifficulty2 == 4)
            {
               System.out.println("Play is true, it is player 2's turn, difficulty is 4");
               System.out.print("Select your column: ");
               selection = scan.nextInt();
               makeMove(selection, player2);
               showBoard();
               System.out.println("Now it is your turn");       
               turn = true;
    
    }
    }
}
}
public void chooseMoveGraphics1 (int myDifficulty1, int selection, int player)
{
            if (myDifficulty1 == 0)
            {
                Random generator = new Random();
                selection = generator.nextInt(7)+1;
                makeMove(selection, player);
                lastMove = selection;
                turn = false;
            }
            else if(myDifficulty1 == 1)
       {
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           if (count == 0)
           {
           makeMove(selection, player);
           lastMove = selection;
           count++;
           turn = false;
        }
        else
        {
           while(valid(numRows3, selection, player1)!=true&&count < 20)
           {
              selection = generator.nextInt(7)+1;
              count++;
        }
        makeMove(selection, player);
        lastMove = selection;
        count = 1;
        turn = false;
    }
    }
    else if(myDifficulty1 == 2)
       {
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           if (count == 0)
           {
           makeMove(selection, player);
           lastMove = selection;
           count++;
           turn = false;
        }
        else
        {
           while((valid(numRows3, selection, player1)!=true&&count < 20)||(valid(numRows3, selection, player2)!=true&&count < 20))
           {
              selection = generator.nextInt(7)+1;
              count++;
        }
        makeMove(selection, player1);
        lastMove = selection;
        count = 1;
        turn = false;
    }
    }
    else if(myDifficulty1 == 3)
       {
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           if (count == 0)
           {
           makeMove(selection, player1);
           lastMove = selection;
           count++;
           turn = false;
        }
        else
        {
           while((valid(numRows3, selection, player1)!=true&&count < 20)&&(valid(numRows3, selection, player2)!=true&&count < 20))
           {
              selection = generator.nextInt(7)+1;
              count++;
        }
        makeMove(selection, player1);
        count = 1;
        turn = false;
    }
    }
            else if(myDifficulty1 == 4)
            {
            makeMove(selection, player1);
            lastMove = selection;
            turn = false;
        }
    }
    public void chooseMoveGraphics2 (int myDifficulty2, int selection, int player)
    {
            if(myDifficulty2 == 0)
            {
        Random generator = new Random();
        selection = generator.nextInt(7)+1;
        makeMove(selection, player2);
        lastMove = selection;
        turn = true;
    }
       else if(myDifficulty2 == 1)
       {
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           if (count == 0)
           {
           makeMove(selection, player2);
           lastMove = selection;
           count++;
           turn = true;
        }
        else
        {
           while(valid(numRows3, selection, player2)!=true&&count < 20)
           {
              selection = generator.nextInt(7)+1;
              count++;
        }
        makeMove(selection, player2);
        lastMove = selection;
        count = 1;
        turn = true;
    }
    }
    else if(myDifficulty2 == 2)
       {
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           if (count == 0)
           {
           makeMove(selection, player2);
           lastMove = selection;
           count++;
           turn = true;
        }
        else
        {
           while((valid(numRows3, selection, player2)!=true&&count < 20)||(valid(numRows3, selection, player1)!=true&&count < 20))
           {
              selection = generator.nextInt(7)+1;
              count++;
        }
        makeMove(selection, player2);
        lastMove = selection;
        count = 1;
        turn = true;
    }
    }
    else if(myDifficulty2 == 3)
       {
           Random generator = new Random();
           selection = generator.nextInt(7)+1;
           if (count == 0)
           {
           makeMove(selection, player2);
           lastMove = selection;
           count++;
           turn = true;
        }
        else
        {
           while((valid(numRows3, selection, player2)!=true&&count < 20)&&(valid(numRows3, selection, player1)!=true&&count < 20))
           {
              selection = generator.nextInt(7)+1;
              count++;
        }
        makeMove(selection, player2);
        lastMove = selection;
        count = 1;
        turn = true;
    }
    }
    
       else if(myDifficulty2 == 4)
            {
               makeMove(selection, player2);
               lastMove = selection;
               turn = true;
    
    }
    }
}  






