/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;
import java.util.Scanner;

public class CristianVladimirOrellanaOrellana {
        public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
    double n1, n2, result;
    
        System.out.println("******* Suma ***********");
        System.out.println("Ingrese el primer numero");
        n1 = leer.nextDouble();
        System.out.println("Ingrese el primer numero");
        n2 = leer.nextDouble();
        
        result = n1 * n2;
        System.out.println("*************************");
        System.out.println("**** resultado de la suma es: "+result);
        System.out.println("*************************");
    
    
    }
}
