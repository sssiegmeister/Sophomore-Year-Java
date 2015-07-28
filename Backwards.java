
/**
 * Write a description of class Backwards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backwards
{
    public static void reverse(String word)
    {
        if(word.length() == 0)
        {
            return;
        }
        else
        {
            char letter = word.charAt (word.length()-1);
            System.out.print(letter);
            word = word.substring(0, word.length()-1);
            reverse(word);
            }
}
}
