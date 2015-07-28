
/**
 * Write a description of class Breakdown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ProjectC
{
    public static void main (String [] args)
    {
        double start1;
        double start2;
        double start3;
        double start4;
        int 1stresult1;
        int 1stresult2;
        int 1stresult3;
        int 1stresult4;
        int 2ndresult1;
        int 2ndresult2;
        int 2ndresult3;
        int 2ndresult4;
        while (true)
        {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the amount of money");
        System.out.print("$");
        start = scan.nextDouble();
        start = start*100;
        int number = (int)start;
        result = number/1000;
        System.out.println(result+" 10 dollar bills");
        number = number%1000;
        result = number/500;
        System.out.println(result+" 5 dollar bills");
        number = number%500;
        result = number/100;
        System.out.println(result+" 1 dollar bills");
        number = number%100;
        result = number/25;
        System.out.println(result+" quarters");
        number = number%25;
        result = number/10;
        System.out.println(result+" dimes");
        number = number%10;
        result = number/5;
        System.out.println(result+" nickels");
        number = number%5;
        System.out.println(number+" pennies");
    }
    }
}
