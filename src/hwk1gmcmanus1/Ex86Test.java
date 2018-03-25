/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk1gmcmanus1;

/**
 *
 * @author gracemcmanus
 */
public class Ex86Test {
   public static void main (String[] args) {
      
      SavingsAccount saver1 = new SavingsAccount (2000);
      SavingsAccount saver2 = new SavingsAccount (3000);
     
      SavingsAccount.modifyInterestRate (.04);
      
      displayBalance (saver1);
      displayBalance (saver2);
      
      SavingsAccount.modifyInterestRate (.05);
      
      saver1.setBalance (2000);
      saver2.setBalance (3000);
      
      displayBalance (saver1);
      displayBalance (saver2);
   }
   private static void displayBalance (SavingsAccount saver) {
      System.out.printf ("%n%s%n", "Balances for 12 months");
      for (int i = 1; i <=12; i++) {
         System.out.printf ("%s %2d = $%.2f%n", "Balance for month", i, 
                 saver.calculateMonthlyInterest());
      }
   }
}
