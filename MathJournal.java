
/**
 * Write a description of class MathJournal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MathJournal
{
    public static void main(String[]args)
    {
        for (int d1=1; d1<10; d1++)
        {
            for(int d2=0; d2<10; d2++)
            {
                for(int d3=0; d3<10; d3++)
                {
                    String result = ""+d1+d2+d3;
                    boolean even=false;
                    if (d3==0)
                    even=true;
                    if (d3==2)
                    even=true;
                    if (d3==4)
                    even=true;
                    if (d3==6)
                    even=true;
                    if (d3==8)
                    even=true;
                    if (d2+d3==9&&even==true&&(d1+d2+d3)%3==0)
                    System.out.println(result);
                }
            }
        }
    }
}
