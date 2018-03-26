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
      
      String hugeInt1 = "1234326";
      String hugeInt2 = "1567";
      
      if (hugeInt1.length() <= 40 && hugeInt2.length() <= 40) {
         
         HugeInteger num1 = new HugeInteger (hugeInt1);
         int[] hInt1 = num1.parse();
         
         HugeInteger num2 = new HugeInteger (hugeInt2);
         int[] hInt2 = num2.parse();
         
         String hugeInt3 = HugeInteger.toString (hInt1);
         System.out.printf ("Huge integer string = %s%n", hugeInt3);
         
         boolean compare = HugeInteger.isGreaterThan(hInt1, hInt2);
         System.out.printf ("Int1 greater: %b%n", compare);
         
         compare = HugeInteger.isGreaterThanOrEqualTo(hInt1, hInt2);
         System.out.printf ("Int1 greater than or equal to: %b%n", compare);
         
         compare = HugeInteger.isLessThanOrEqualTo(hInt1, hInt2);
         System.out.printf ("Int1 less than or equal to: %b%n", compare);
         
         compare = HugeInteger.isLessThan(hInt1, hInt2);
         System.out.printf ("Int1 less than: %b%n", compare);
         
         compare = HugeInteger.isEqualTo(hInt1, hInt2);
         System.out.printf ("Int1 equal to Int2: %b%n", compare);
         
         compare = HugeInteger.isNotEqualTo(hInt1, hInt2);
         System.out.printf ("Int1 not equal to Int2: %b%n", compare);
         
         boolean zero = HugeInteger.isZero(hInt2);
         System.out.printf ("Number is equal to zero: %b%n", zero);
         
         int[] sum = new int[41];
         sum = HugeInteger.add (hInt1, hInt2);
         
         System.out.print ("Sum of two huge integers = ");
         int i = 0;
         while (sum[i] == 0) {      // ignore leading 0's
            i++;
         }
         for (int j = i; j < sum.length; j++) {
            System.out.printf ("%d", sum[j]);
         }
         System.out.println();
         
         int[] difference = new int[41];
         difference = HugeInteger.subtract(hInt1, hInt2);
         
         System.out.print ("Difference of two huge integers = ");
         i = 0;
         while (difference[i] == 0) {    // ignore leading 0's
            i++;
         }
         for (int j = i; j < sum.length; j++) {
            System.out.printf ("%d", difference[j]);
         }
         System.out.println();
      }
      else {
         System.out.println ("Invalid number: must be <= 40 characters");
      }
   }
   
}
