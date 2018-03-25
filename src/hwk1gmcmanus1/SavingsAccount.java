package hwk1gmcmanus1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gracemcmanus
 */
public class SavingsAccount {
   
   private static double annualInterestRate;
   
   private double savingsBalance;   //instance variable
   
   // argument constructor
   public SavingsAccount (double savingsBalance) {
      this.savingsBalance = savingsBalance;
   }
   
   public void setBalance (double savingsBalance) {
      this.savingsBalance = savingsBalance;
   }
   
   public double calculateMonthlyInterest() {
      double interest = savingsBalance * annualInterestRate / 12;
      savingsBalance += interest;
      
      return savingsBalance;
   }
   
   public static void modifyInterestRate (double intRate) {
      annualInterestRate = intRate;
   }
}
