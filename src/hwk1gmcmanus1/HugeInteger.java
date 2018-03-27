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
            if (intA[i] > intB[i]) {
               return true;
            }
            else if (intA[i] == intB[i]) {
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
            if (intA[i] < intB[i]) {
               return true;
            }
            else if (intA[i] == intB[i]) {
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
   
   public static String toString (int[] intA) {
      
      String hugeInteger = "";
      
      for (int i = 0; i < intA.length; i++) {
         hugeInteger = hugeInteger + Integer.toString(intA[i]);
      } 
      return hugeInteger;
   }
   
   public static int[] add (int[] intA, int[] intB) {
      
      int i = intA.length - 1;
      int j = intB.length - 1;
      int k = 40;     // max length
      int carry = 0;
      int[] sum = new int[41];
      
      while (i >= 0 && j >= 0) {  
         
         sum[k] = intA[i] + intB[j] + carry;
         carry = 0;
         if (sum[k] > 9) {
            carry = 1;
            sum[k] -=10;
         }
         k--;
         i--;
         j--;
      }
                 
      if (i >= 0) {
         sum[k] = intA[i] + carry;  // 1st num has more digits
         i--;
         k--;
         while (i >= 0) {
            sum[k] = intA[i];
            i--;
            k--;
         }
      }
      else if (j >= 0) {
         sum[k] = intB[j] + carry;  // 2nd num has more digits
         j--;
         k--;
         while (j >= 0) {
            sum[k] = intB[j];
            j--;
            k--;
         }
      }
      return sum;
   }
   
   public static int[] subtract (int[] intA ,int[] intB) {
      
      int i = intA.length - 1;
      int j = intB.length - 1;
      int k = 40;     // max length
      int borrow = 0;
      int[] diff = new int[41];
      
      if (HugeInteger.isEqualTo (intA, intB) == true) {
         diff [k] = 0;
         return diff;
      }
      else if (HugeInteger.isGreaterThan (intA, intB) == true) {
      
         while (i >= 0 && j >= 0) {
       
            if (intA [i] >= intB[j]) {
               diff[k] = intA[i] - intB[j];
            }
            else {
               intA[i-1] --;
               intA [i] += 10;
               diff[k] = intA[i] - intB[j];
            }
            k--;
            i--;
            j--;
         }
         
         if (i >= 0) {            
            while (i >= 0) {
               diff[k] = intA[i];
               i--;
               k--;
            }
         }
      }
      return diff;
   }
}
