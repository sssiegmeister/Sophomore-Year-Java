
/**
 * Write a description of class SydneyKarma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class SydneyKarma
{
    public static void main(String[]args)
    {
        int karma = 0;
        int movement;
        String description = "tolerable";
        Scanner scan = new Scanner (System.in);
        
        while (true)
        {
            System.out.println("Descriptive status: "+description);
            System.out.println("Numerical status: "+karma);
            movement = scan.nextInt();
            if (movement == 1)
            {
                karma = karma+1;
                if(karma > 6)
                description = "very friendly";
                else if(karma > 2)
                description = "friendly";
                else if(karma > -3)
                description = "tolerable";
                else if (karma > -7)
                description = "annoying";
                else if (karma <= -7)
                description = "very annoying";
            }
            if (movement == 0)
            {
                karma = karma-1;
                if(karma > 6)
                description = "very friendly";
                else if(karma > 2)
                description = "friendly";
                else if(karma > -3)
                description = "tolerable";
                else if (karma > -7)
                description = "annoying";
                else if (karma <= -7)
                description = "very annoying";
            }
        }
    }
}
