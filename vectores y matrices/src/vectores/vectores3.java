
package vectores;

import java.util.Scanner;

public class vectores3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        Scanner entrada  = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array : ");
        System.out.println("");
        int n = Integer.parseInt(entrada.nextLine());
        int array [] = new int[n];
        System.out.println("**************************************");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("ARRAY [" + (i+1)+"] :" );
            array[i] = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("***************************************");
        System.out.println("***** RESULTADO POR PANTALLA **********");
        System.out.println("***************************************");
        
        //resultado del array 
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("*******************************************");
        System.out.println("");
        System.out.println("invertimos el array ");       
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
            
        }
    }
    
}
