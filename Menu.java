
/**
 * Write a description of class Menu here.
 * 
 * @author (Sam Siegmeister) 
 * @version (2/19/13)
 */
import java.util.Scanner;
public class Menu
{
    public static void main (String[] args)
    {
    int choice1, choice2, myNum=0, acctNum=0;
    double depositNum, withdrawNum;
    String newName, firstName, lastName;
    boolean open = false;
    
    Bank myAccounts = new Bank();
    
    myAccounts.addAccount ("Ted Murphy", 0, 102.56);
    myAccounts.addAccount ("Jane Smith", 1, 40.00);
    myAccounts.addAccount ("Edward Demsey", 2, 759.32);

    Scanner scan = new Scanner (System.in);
    
    while (open == false)
    {
        System.out.println("Welcome to L&L Bank.");
        System.out.println("Press 1 to enter your account number");       
        System.out.println("Press 2 to create a new account");
        System.out.println("Press 3 to view accounts");
        System.out.print("Please select your number: ");
        choice1 = scan.nextInt();
        
        if (choice1 == 1)
        {
        System.out.print("Please enter your account number: ");
        myNum = scan.nextInt();
    
        if(myNum <= 30)
        {
            open = true;
        }
        else
        {
            System.out.println("Invalid account number.");
        }
    }
    if (choice1 == 2)
    {
        System.out.print("Please enter your first name: ");
        firstName = scan.next();
        System.out.print("Please enter your last name: ");
        lastName = scan.next();
        newName = (firstName+" "+lastName);
        myAccounts.addAccount (newName, myAccounts.getCount(), 0.0);
        //System.out.println("Thank you for starting your account " + newName + ". Your account number is " + myAccounts.getCount());
        System.out.println("Thank you for starting your account " + newName + ".\nPlease refer to the view accounts option to learn your account number.");
    }
        
    if (choice1 == 3)
    {
       System.out.println(myAccounts);
    }
    while (open == true)
    {
    System.out.println("Welcome to your account "+myAccounts.getName(myNum));
    System.out.println("Press 1 to withdraw");
    System.out.println("Press 2 to deposit");
    System.out.println("Press 3 to exit your account");
    System.out.println("Press 4 to terminate your account");
    System.out.print("Enter your number: ");
    choice2 = scan.nextInt();

    if (choice2 == 1)
    {
      System.out.println("Your current balance is " + myAccounts.getBalance(myNum));
      System.out.println("When making a withdraw, you must enter a decimal number.");
      System.out.print("Please make a withdraw: ");
      withdrawNum = scan.nextDouble();
      myAccounts.withdraw(myNum, withdrawNum);
      if(myAccounts.getBalance(myNum) < 0)
      {
          System.out.println("Invalid transaction. You have insufficient funds to make that withdraw.");
          myAccounts.withdraw(myNum, -(withdrawNum));
        }
      System.out.println("Your new balance is " + myAccounts.getBalance(myNum));
    }
    if (choice2 == 2)
    {
      System.out.println("Your current balance is " + myAccounts.getBalance(myNum));
      System.out.println("When making a deposit, you must enter a decimal number.");
      System.out.print("Please make a deposit: ");
      depositNum = scan.nextDouble();
      myAccounts.deposit(myNum, depositNum);
      System.out.println("Your new balance is " + myAccounts.getBalance(myNum));
    }
    if (choice2 == 3)
    {
        open = false;
    }
    if (choice2 == 4)
    {
        myAccounts.getBalance(myNum=0);
        open = false;
    }
}
}
}
}
