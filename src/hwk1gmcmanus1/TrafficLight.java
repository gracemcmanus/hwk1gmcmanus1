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
public enum TrafficLight {
   RED (60),
   YELLOW (3),
   GREEN (60);
   
   private final int duration;  // number of seconds
   
   TrafficLight (int duration) {
      this.duration = duration;
   }
   
   public int getDuration () {
      return duration;
   }
}
