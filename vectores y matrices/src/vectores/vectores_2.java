
package vectores;

import java.util.Scanner;

/**
 *
 * @author EL CAPO
 */
public class vectores_2 {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
            
        System.out.println("DIMENCION DEL ARRAYZ: ");
        int n = Integer.parseInt(entrada.nextLine());
        
        Scanner  entrada_estudiantes = new Scanner(System.in);
        Scanner  entrada_nota = new Scanner(System.in);
        
        String estudiantes [] = new String[n]; //llenamos las dimenciones del array con el dato solicitado al usuario
        double notas [] = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nombre del estudiante: " +(i+1)+ ":");
            estudiantes [i] = entrada_estudiantes.nextLine();
            System.out.println("Ingrese las notas del Estudiante: ");
            notas[i] = Double.parseDouble(entrada_nota.nextLine());
        }
        System.out.println("");
        System.out.println("******************************************************");
        System.out.println("**************** BUSCAR POR PANTALLA *****************");
        System.out.println("******************************************************");
        System.out.println("");
        
        System.out.println("Introduce el nomnbre del estudiante a buscar: ");
        String estudiante = entrada.nextLine();
        
        System.out.println("******************************************************");
        System.out.println("************** RESULTADOS ENCONTRADOS ****************");
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
         
            if ( estudiantes[i].equals(estudiante)) {
                System.out.println("Estudiante ::::: " +estudiante+ "::: tiene una nota de ::: " +notas[i]);
            }
            else{
                System.err.println("El estudiante Solicitado no aparece en la Memoria del Sistema, Revisar EL  Nombre por favor.");
            }
        }
               
    }
}
    
    

