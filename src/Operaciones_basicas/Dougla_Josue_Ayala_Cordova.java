package Operaciones_basicas;

import java.util.Scanner;

public class Dougla_Josue_Ayala_Cordova {
    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
      
    double numero1, numero2, R;
    
        System.out.println("-----RESTA-----");
        
        System.out.println("Digite el primer valor");
        numero1 = leer.nextDouble();
        
         System.out.println("Digite el segundo valor");
        numero2 = leer.nextDouble();
        
        R = numero1 - numero2;
        
        System.out.println("-----------------------");
        System.out.println("Resultado" + R);
        System.out.println("-----------------------");
        
        
    }     
    
}
