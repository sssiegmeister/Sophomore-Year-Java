
/**
 * Write a description of class Function here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Function
{
    public static void main(String[]args)
    {
        double x;
        double y;
        String wrapped;
        Scanner scan = new Scanner (System.in);
        System.out.println("Was the item wrapped (yes or no)?");
        wrapped = scan.nextLine();
        System.out.println("What is the price of the item (in decimal form)?");
        System.out.print("$");
        x = scan.nextDouble();
        if(wrapped.equals("yes"))
        {
            y = (x-3)/1.08;
            System.out.printf("The original price is $%.2f", y);
        }
        else if(wrapped.equals("no"))
        {
            y = x/1.08;
            System.out.printf("The original price is $%.2f", y);
        }
    }
}
