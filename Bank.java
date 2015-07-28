/**
 * Write a description of class Menu here.
 * 
 * @author (Sam Siegmeister) 
 * @version (2/19/13)
 */

import java.text.NumberFormat;

public class Bank
{
   private Account[] bank;
   private int count;
   private double totalBalance;

   public Bank ()
   {
      bank = new Account[100];
      count = 0;
      totalBalance = 0.0;
   }
   public void addAccount (String name, int accountNum,
      double myBalance)
   {
      if (count == bank.length)
         increaseSize();

      bank[count] = new Account (name, accountNum, myBalance);
      totalBalance += myBalance;
      count++;
   }
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String report = "\n\nL&L Bank account info\n\n";

      report += "Number of accounts: " + count + "\n";
      report += "Total money in the bank: " + fmt.format(totalBalance) + "\n";
      report += "Average account balance: " + fmt.format(totalBalance/count);

      report += "\n\nAccount List:\n\n";

      for (int account = 0; account < count; account++)
         report += bank[account].toString() + "\n";

      return report;
   }
    public double getBalance(int myAcctNum)
   {
       return bank[myAcctNum].getBalance();
   }
   public String getName(int myAcctNum)
   {
       return bank[myAcctNum].getName();
    }
   public void withdraw(int myAcctNum, double withdrawAmount)
   {
       bank[myAcctNum].withdraw(withdrawAmount, 2.50);
    }
   public void deposit(int myAcctNum, double depositAmount)
   {
       bank[myAcctNum].deposit(depositAmount);
    }
   public int getCount()
   {
       return count;
    }
   public int acctLength()
   {
       return bank.length;
    }
   public Account returnAcct(int index)
   {
       return bank[index];
    }
   private void increaseSize ()
   {
      Account[] temp = new Account[bank.length * 2];

      for (int account = 0; account < bank.length; account++)
         temp[account] = bank[account];

      bank = temp;
   }
}
