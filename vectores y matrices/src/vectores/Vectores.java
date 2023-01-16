
package vectores;

import java.util.Scanner;


public class Vectores {

  
    public static void main(String[] args) {
        
        
        Scanner entrada_producto = new Scanner(System.in);
        Scanner entrada_unidades = new Scanner(System.in);
        Scanner entrada_precios = new Scanner(System.in);
        
        String productos [] = new String[3];
        int  unidades [] = new int [3];
        double precios []= new double[3];
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Ingrese producto" +(i+1)+":");
            productos[i] = entrada_producto.nextLine();
            
            System.out.println("Ingrese unidades" +(i+1)+":");
            unidades [i] = Integer.parseInt(entrada_unidades.nextLine());
            
            System.out.println("Ingrese el precio del producto" +(i+1)+":");
            precios[i] = Double.parseDouble(entrada_precios.nextLine());
        }
            System.out.println("");
            System.out.println("***********************************");
            System.out.println(" -- PROODUCTOS -- UNIDADES -- PRECIO -- TOTAL PARCIAL.");
            System.out.println("***********************************");
            double total = 0.0;
        
            for (int i = 0; i < 3; i++) {
                System.out.print(productos [i]+ "--" + unidades [i] + "--" + precios [i]+ "--" + unidades [i]*precios[i]+ "\n");
                total = total +(unidades[i]*precios[i]);    
                
                System.out.println("********************************");
                System.out.println("TOTAL A PAGAR  $ " +total);
                
                
              }   
    }
}
