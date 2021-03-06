package edu.jalc.automobile.onlinebuilder.components.body.suv;

import edu.jalc.automobile.parts.body.*;

public class EconomySuvBody extends SuvBody {

  public EconomySuvBody(Quarterpanels quarterpanels, EngineCompartment engineCompartment,
                        StandardCabin standardCabin, Hatchback hatchback){
    super(quarterpanels, engineCompartment, standardCabin, hatchback);
  }
  public StandardCabin getCabin(){
    return (StandardCabin) super.getCabin();
  }

 public String toString(){
      return "EconomySuvBody has :\n" +
                       "\t"+ getQuarterpanels() +"\n"+
                       "\t"+ getEngineCompartment()+"\n"+
                       "\t"+ getCabin()+"\n"+
                       "\t"+ getHatchback();
   
   }}
