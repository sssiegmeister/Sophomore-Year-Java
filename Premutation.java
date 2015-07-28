
/**
 * Write a description of class Premutation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Premutation
{
        static int[] num;
    public static void premutate(int n)
    {
        if(num.length == n)
        {
            return;
        }
        else
        {
            System.out.println(num);
            premutate(n);
        }
    }
}
