/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emag;

/**
 *
 * @author Andrew
 */
public class Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Companie c= new Companie();
        
        c.creareCont("nume");
        
        System.out.println(c);
        
        Client c1= new Client("nume","prenume");
        
        System.out.println(c1);
        
       Admin a=new Admin();
       
       a.creareCont("nume", "pass");
       
        System.out.println(a);
        
    }
    
}
