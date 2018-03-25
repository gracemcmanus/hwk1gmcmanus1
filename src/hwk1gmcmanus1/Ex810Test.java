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
public class Ex810Test {
   public static void main (String[] args) {
      
      for (TrafficLight light : TrafficLight.values()){
         System.out.printf ("%s light has a duration of %d seconds %n", light,
                 light.getDuration());
      }
   }
}
