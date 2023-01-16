
package vectores;

//creae un amatriz de   4 x 5 colunnas, llenarno y mostrar el resultado.
import java.util.Scanner;

/**
 *
 * @author EL CAPO
 */
public class matriz {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("**** LLENAR LA MATRIZ SOLO NUMEROS ********");
        System.out.println("******************************");
        
        System.out.println("Filas: ");
        int fila = Integer.parseInt(entrada.nextLine());
        System.out.println("");                         //le damos las dimenciones a la matriz 
        System.out.println("Colunnas: ");
        int colunna = Integer.parseInt(entrada.nextLine());
        System.out.println("");
        int matriz [][] = new int[fila][colunna];   
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("MATRIZ["+(i+1)+"],["+(j+1)+"]: ");  //llenamos los campos de la matriz
                matriz[i][j] = Integer.parseInt(entrada.nextLine());      
            }
        }
        System.out.println("*******************************");
        System.out.println("****** MOSTAMOS DATOS *********");
        System.out.println("*******************************");
        System.out.println("");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {  //mostramos por pantalla los datos de la matriz
                System.out.print(matriz[i][j]+"\t"); 
            }
            System.out.println();
        }
    }
}
