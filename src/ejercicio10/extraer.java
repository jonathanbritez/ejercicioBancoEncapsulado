/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author jonathan
 */
public class extraer {
    
    private String nombre;
    private String Tipo;
    private Integer saldo;
    
   
    
    public void Nombre(String Nom){ //setter
    
        nombre = Nom;
    
    }
    
    public int saldo(){ //setter
    
        return saldo = 20000;
    
    }
    
    
    public String imprimir(int saldo){//getter
        
         if(saldo<20000){
        
            saldo =20000 - saldo;
           
         
        }
         
         return nombre + " Te queda disponible: " + saldo;
         
         
    
    }
    
}
