/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author jonathan
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //String nombreTitular = "";
         //String tipoDeCuenta = "";
        //Integer saldo = 20000;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("elija el monto a extraer: ");
        int saldo = entrada.nextInt();
        
        extraer Saldo = new extraer();
        Saldo.Nombre("Jonathan");
        Saldo.saldo();
        
        
        System.out.println(Saldo.imprimir(saldo));
    }
    
}
