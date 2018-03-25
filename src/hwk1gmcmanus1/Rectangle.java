/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk1gmcmanus1;
/**
 *
 * @author gracemcmanus 3/20/2018
 */
public class Rectangle {
   
   private float length;   // instance variables between 0.0 and 20.0
   private float width;
   
// constructor: no arguments
   public Rectangle () {
      this (1, 1);
   }
// constructor: length and width supplied
   public Rectangle (float length, float width) {
   
      if (length <= 0.0 || length > 20.0) {
         throw new IllegalArgumentException ("invalid length");
      }
      if (width <= 0.0 || width > 20.0) {
         throw new IllegalArgumentException ("invalid width");
      }
      this.length = length;
      this.width = width;
   }
   // Set methods
   public void setLength (float length) {
      if (length <= 0.0 || length > 20.0) {
         throw new IllegalArgumentException ("invalid length");
      }
      this.length = length;
   }
   
   public void setWidth (float width) {
      if (width <= 0.0 || width > 20.0) {
         throw new IllegalArgumentException ("invalid width");
      } 
      this.width = width;
   }
   
   // Get methods
   public float getLength () {
      return length;
   }
   
   public float getWidth () {
      return width;
   }
   
   public float calcArea () {
      return length * width;
   }
   
   public float calcPerimeter () {
      return (2 * length) + (2 * width);
   }
}
