
/**
 * Write a description of class Blob here.
 * 
 * @author (Sam Siegmeister) 
 * @version (4/14/13)
 */
public class Blob 
{
private final int TRY=3;
private final int FOUND=7;
private int blobs=0;
public int[][] board={{0,0,1,0},
                      {1,0,1,1},
                      {1,0,0,0},
                      {0,1,1,1}};
   public boolean check(int row, int column)
   {   
       boolean done=false;
       if(done==true)
       return done;
       else
       {
       if(column<board.length)
       {
       if(row<board[0].length)
       {
       if (board[row][column]==1)
       {
           blobs++;
           board[row][column]=FOUND;
           search(row,column);
       }
       if(board[row][column]==0||
          board[row][column]==2)
       {
        board[row][column]=TRY;
       }
       column++;
       check(row,column);
       }
       }
       else
       {
        row++;
        column=0;
        check(row,column);
       }
       if(row==board[0].length&&column==board.length);
       {
        done=true;
       }
       return done;
       }
   }
   private boolean valid (int row, int column)
   {
      boolean result = false; 
      if (row >= 0 && row < board.length &&
          column >= 0 && column < board[row].length)     
         if (board[row][column] == 1||board[row][column]==0)
            result = true;
      return result;
   }
   public void search(int row, int column)
   {
    if(valid(row-1,column-1)==true&&board[row-1][column-1]==1)
    {
     board[row-1][column-1]=FOUND;
     search(row-1,column-1);
    }
    if(valid(row-1,column-1)==true&&board[row-1][column-1]==0)
    board[row-1][column-1]=TRY;
    if(valid(row-1,column)&&board[row-1][column]==1)
    {
    board[row-1][column]=FOUND;
    search(row-1,column);
    }
    if(valid(row-1,column)==true&&board[row-1][column]==0)
    board[row-1][column]=TRY;
    if(valid(row-1,column+1)==true&&board[row-1][column+1]==1)
    {
    board[row-1][column+1]=FOUND;
    search(row-1,column+1);
    }
    if(valid(row-1,column+1)==true&&board[row-1][column+1]==0)
    board[row-1][column+1]=TRY;
    if(valid(row,column-1)==true&&board[row][column-1]==1)
    {
    board[row][column-1]=FOUND;
    search(row,column-1);
    }
    if(valid(row,column-1)==true&&board[row][column-1]==0)
    board[row][column-1]=TRY;   
    if(valid(row,column+1)==true&&board[row][column+1]==1)
    {
    board[row][column+1]=FOUND;
    search(row,column+1);
    }
    if(valid(row,column+1)==true&&board[row][column+1]==0)
    board[row][column+1]=TRY;
    if(valid(row+1,column-1)==true&&board[row+1][column-1]==1)
    {
    board[row+1][column-1]=FOUND;
    search(row+1,column-1);
    }
    if(valid(row+1,column-1)==true&&board[row+1][column-1]==0)
    board[row+1][column-1]=TRY;
    if(valid(row+1,column)==true&&board[row+1][column]==1)
    {
    board[row+1][column]=FOUND;
    search(row+1,column);
    }
    if(valid(row+1,column)==true&&board[row+1][column]==0)
    board[row+1][column]=TRY;
    if(valid(row+1,column+1)==true&&board[row+1][column+1]==1)
    {
    board[row+1][column+1]=FOUND;
    search(row+1,column+1);
    }
    if(valid(row+1,column+1)==true&&board[row+1][column+1]==0)   
    board[row+1][column+1]=TRY;      
   }
   public String toString ()
   {
      String result = "\n";

      for (int row=0; row < board.length; row++)
      {
         for (int column=0; column < board[row].length; column++)
            result += board[row][column] + "";
         result += "\n";
      }
      result+="the amount of blobs found:"+blobs;
      return result;
   }   
}
