/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo05;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("division");
        System.out.println(10 / 3);
        
        System.out.println("division con decimal");
        System.out.println(10 / 3.0);
        
        System.out.println("division con jerarquia de operaciones");
        System.out.println(10 / 3.0 + 1);
        System.out.println(10 / (3.0 + 1));
        
        System.out.println("porcentaje de un numero");
        System.out.println(10 % 3 );
        
        System.out.println("un numero elevado a 2");
        System.out.println(Math.pow(10, 2));
        
        System.out.println("raiz cuadrada de un numero");
        System.out.println(Math.sqrt(16));
        
        double m = Math.sqrt(16);
        System.out.println(m);
        
    }

}
