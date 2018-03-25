package hwk1gmcmanus1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gracemcmanus 3/20/2018
 */
public class Ex84Test {
   public static void main (String[] args) {
      
      Rectangle rec1 = new Rectangle ();  // test no argument constructor
      
      displayRectangle (rec1);
      
      Rectangle rec2 = new Rectangle (3,5); // test argument constructor
     
      displayRectangle (rec2); 
      
      Rectangle rec3 = new Rectangle (); // test set methods
      
      rec3.setLength (6);
      rec3.setWidth (10);
      
      displayRectangle (rec3);
      
      // attempt to initialize object with an invalid value
      
      try {
         Rectangle rec4 = new Rectangle (25,20);
      }
      catch (IllegalArgumentException e){
         System.out.printf ("Exception while initializing Rectangle object: %s%n",
          e.getMessage());
      }
      
   }
   
   private static void displayRectangle (Rectangle rec) {
      System.out.printf ("Rectangle length = %.1f%n", rec.getLength());
      System.out.printf ("Rectangle width = %.1f%n", rec.getWidth());
      
      System.out.printf ("Area = %.1f%n", rec.calcArea());
      System.out.printf ("Perimeter = %.1f%n%n", rec.calcPerimeter());
   }
   
}
