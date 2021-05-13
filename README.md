# ejercicioBancoEncapsulado
ejercicio n° 10

public class CuentaBancaria 
{

   
    public static void main(String[] args) 
    {
       
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


public class extraer {
    
    private String nombre;
    private String Tipo;
    private Integer saldo;
    
   
    
    public void Nombre(String Nom){ //setter
    
        nombre = Nom;
    
    }
    
    public int saldo(){ //getter
    
        return saldo = 20000;
    
    }
    
    
    public String imprimir(int saldo){//getter
        
         if(saldo<20000){
        
            saldo =20000 - saldo;
           
         
        }
         
         return nombre + " Te queda disponible: " + saldo;
         
         
    
    }
    
}
