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
public class Ex817Test {
   public static void main (String[] args) {
      
      String hugeInt1 = "127";
      String hugeInt2 = "1234";
      
      if (hugeInt1.length() <= 40 && hugeInt2.length() <= 40) {
         
         HugeInteger num1 = new HugeInteger (hugeInt1);
         int[] result1 = num1.parse();
         
         HugeInteger num2 = new HugeInteger (hugeInt2);
         int[] result2 = num2.parse();
         
         boolean compare = HugeInteger.isGreaterThan(result1, result2);
         System.out.printf ("Int1 greater: %b%n", compare);
         
         compare = HugeInteger.isGreaterThanOrEqualTo(result1, result2);
         System.out.printf ("Int1 greater than or equal to: %b%n", compare);
         
         compare = HugeInteger.isLessThanOrEqualTo(result1, result2);
         System.out.printf ("Int1 less than or equal to: %b%n", compare);
         
         compare = HugeInteger.isLessThan(result1, result2);
         System.out.printf ("Int1 less than: %b%n", compare);
         
         compare = HugeInteger.isEqualTo(result1, result2);
         System.out.printf ("Int1 equal to Int2: %b%n", compare);
         
         compare = HugeInteger.isNotEqualTo(result1, result2);
         System.out.printf ("Int1 not equal to Int2: %b%n", compare);
         
         boolean zero = HugeInteger.isZero(result2);
         System.out.printf ("Number is equal to zero: %b%n", zero);
         
         int[] sum = new int[41];
         sum = HugeInteger.add (result1, result2);
         for (int i = 0; i < sum.length; i++) {
            System.out.printf ("%d", sum[i]);
         }
         System.out.println();
      }
      else {
         System.out.println ("Invalid number: must be <= 40 characters");
      }
   }
   
}
