package Emag;

import java.util.ArrayList;

public class Client extends Persoana {
ArrayList<Produs> cos=new ArrayList<>(); 
ArrayList<Produs> favorite=new ArrayList<>(); 

    public Client(String username, String password) {
        super.username=username;
        super.password=password;
    }



  public void creareCont(String username, String password) {
      super.username=username;
      super.password=password;
     
      
  }

  public void conectare() {
      
  }

  public void editareCont(String username, String password) {
      
      super.username=username;
      super.password=password;
      
  }

  public void adaugareProduseinCos(Produs produs) {
      cos.add(produs);
      
      
  }

  public void adaugareProduselaFavorite( Produs produs ) {
      favorite.add(produs);
  }

  public void plataProduse() {
      
  }

  public void stergereProdusedinCos( Produs produs ) {
      for(int i =0; i<cos.size(); i++)
          if( produs == cos.get(i) )
              cos.remove(i);

  }

  public void adaugareRecenziiProduse( Produs produs ,String recenzie ) {
  }

  public void stergereCont() {
  }

    @Override
    public String toString() {
        return "Client{" + "username=" + super.username + ", password=" + password + '}';
    }
  
  

}