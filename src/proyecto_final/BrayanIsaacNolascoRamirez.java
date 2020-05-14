
package proyecto_final;

import java.util.Scanner;

/**
 * @author Nolasco
 */
public class BrayanIsaacNolascoRamirez {
   public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
      
    double numero1, numero2, M;
    
        System.out.println("----MULTIPLICACION-----");
        
        System.out.println("Digite el primer valor");
        numero1 = leer.nextDouble();
        
         System.out.println("Digite el segundo valor");
        numero2 = leer.nextDouble();
        
        M = numero1 * numero2;
        
        System.out.println("-----------------------");
        System.out.println("Resultado" + M);
        System.out.println("-----------------------");
        
        
    }     
        
}
