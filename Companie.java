/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emag;

import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class Companie {
    public ArrayList<Produs> myProdus=new ArrayList<>();
    public ArrayList<Persoana>  Persoana=new ArrayList<>();
    String nume;
  
    
    public void creareCont(String nume) {
      this.nume=nume;
  }

  public void adaugareProduse(Produs produs) {
      myProdus.add(produs);
  }

  public void stergereProduse(Produs produs) {
      for(int i=0; i<myProdus.size(); i++)
          if( produs== myProdus.get(i) )
              myProdus.remove(i);
  }

    @Override
    public String toString() {
        return "Companie{" + "nume=" + nume + '}';
    }

    public Companie() {
    }
    
    
  
  
    
}
