
/**
 * Write a description of class BRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BRunner
{
    public static void main (String[] args)
    {
        String myWord;
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a word: ");
        myWord = scan.nextLine();
        Backwards b = new Backwards();
        b.reverse(myWord);
    }
}
