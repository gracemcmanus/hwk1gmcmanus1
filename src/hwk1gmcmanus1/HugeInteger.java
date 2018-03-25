/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk1gmcmanus1;

/**
 *
 * @author gracemcmanus 3/21/2018
 */
public class HugeInteger {
   
   private final String strNumber;
   //private final int[] hugeInt = new int[40];
   
   public HugeInteger (String strNumber) { 
      this.strNumber = strNumber;
   }
   
   public int[] parse () {
      //if (strNumber.length() <= 40) {
         int[] intA = new int[strNumber.length()];
         
         for (int i = 0; i < strNumber.length(); i++) {
            intA[i] = strNumber.charAt(i) - '0';
            System.out.printf ("%d", intA[i]);
         }
         System.out.println ();
         return intA;
      //}
   }
   
   public static boolean isGreaterThan (int[] intA, int[] intB) {
      
      if (intA.length > intB.length) {
         return true;
      }
      else if (intA.length < intB.length) {
         return false;
      }
      else {
         int i = 0;
         while (i < intA.length) {
            if (intA[i] > intB[i]) {
               return true;
            }
            else if (intA[i] < intB[i]) {
               return false;
            }
            else {
               i++;
            }
         }
         return false;
      }
   }
   
   public static boolean isGreaterThanOrEqualTo (int[] intA, int[] intB) {
      
      if (intA.length > intB.length) {
         return true;
      }
      else if (intA.length < intB.length) {
         return false;
      }
      else {
         int i = 0;
         while (i < intA.length) {
            if (intA[i] >= intB[i]) {
               i++;
            }
            else if (intA[i] < intB[i]) {
               return false;
            }
         }
         return true;
      }
   }
   
   public static boolean isLessThan (int[] intA, int[] intB) {
      
      if (intA.length < intB.length) {
         return true;
      }
      else if (intA.length > intB.length) {
         return false;
      }
      else {
         int i = 0;
         while (i < intA.length) {
            if (intA[i] < intB[i]) {
               return true;
            }
            else if (intA[i] > intB[i]) {
               return false;
            }
            else {
               i++;
            }
         }
         return false;
      }
   }
   
   public static boolean isLessThanOrEqualTo (int[] intA, int[] intB) {
      
      if (intA.length < intB.length) {
         return true;
      }
      else if (intA.length > intB.length) {
         return false;
      }
      else {
         int i = 0;
         while (i < intA.length) {
            if (intA[i] <= intB[i]) {
               i++;
            }
            else if (intA[i] > intB[i]) {
               return false;
            }
         }
         return true;
      }
   }
   
   public static boolean isEqualTo (int[] intA, int[] intB) {
      
      if (intA.length != intB.length) {
         return false;
      }
      else {
         int i = 0;
         while (i < intA.length) {
            if (intA[i] == intB[i]) {
               i++;
            }
            else {
               return false;
            }
         }
         return true;
      }
   }
   
   public static boolean isNotEqualTo (int[] intA, int[] intB) {
      
      if (intA.length != intB.length) {
         return true;
      }
      else {
         int i = 0;
         while (i < intA.length) {
            if (intA[i] != intB[i]) {
               return true;
            }
            else {
               i++;
            }
         }
         return false;
      }
   }
   
   public static boolean isZero (int[] intA) {
      
      int i = 0;
      while (i < intA.length) {
         if (intA[i] == 0) {
            i++;
         }
         else {
            return false;
         }
      }
      return true;
   }
   
   public static int[] add (int[] intA, int[] intB) {
      int i = intA.length;
      int j = intB.length;
      int k = 40;     // max length
      int carry = 0;
      int[] sum = new int[41];
      
      while (i > 0 || j > 0) {
         sum[k] = intA[i] + intB[j] + carry;
         carry = 0;
         if (sum[k] > 9) {
            carry = 1;
            sum[k] -=10;
         }
         k++;
         i--;
         j--;
      }
                 
      if (i > 0) {
         sum[k] = intA[i] + carry;
         i--;
         k++;
         while (i > 0) {
            sum[k] = intA[i];
            i--;
         }
      }
      return sum;
   }
}
