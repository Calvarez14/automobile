package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.wheels;

import edu.jalc.automobile.parts.suspension.Wheel;

public class TruckAlumWheel extends Wheel{
   private double diameter, width;

   public TruckAlumWheel(double diameter,double width){
      super(0.0);
      this.diameter=diameter;
      this.width=width;
   }

   public String toString(){
      return +diameter+ "x" +width +" Alum Wheel";
   }
}
