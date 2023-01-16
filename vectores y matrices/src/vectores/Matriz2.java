
//crear un amatriz  con N filas por X collunas y llenarla con numeros aleatorios  entre el 0 y 100
package vectores;

import java.util.Scanner;

/**
 *
 * @author EL CAPO
 */
public class Matriz2 {

   // Funcion para hayar  los numeros aleatorios.
    
    public static int numero_aleatorio(int min, int max) {
        
     return (int)Math.floor(Math.random()*(min-(max+1))+(max+1));  //funcion para generar numeros aleatorios
    }
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        System.out.println("Creacion de la MATRIZ: ");
        System.out.println("");
        System.out.println("FILAS: ");
        int filas = Integer.parseInt(entrada.nextLine());
        System.out.println("");
        System.out.println("COLUNNAS: ");
        int colunnas = Integer.parseInt(entrada.nextLine());
        int matriz [][] = new int[filas][colunnas];
        
        System.out.println("*******************************");
        System.out.println("****** MOSTAMOS DATOS *********");
        System.out.println("*******************************");
        System.out.println("");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero_aleatorio(0, 100);
                System.out.print(matriz[i][j] +"\t");
            }
            System.out.println("");
        }
        
    }
    
}
