
/**
 *Con el objetivo practicar el uso del ciclo repetitivo for, se propone que dado un límite, se presenten las siguientes figuras. Por ejemplo si el límite es 4:

 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        int limite, i, j;
        System.out.print("Ingrese el limite que desea: ");
        limite=tcl.nextInt();
        
        // Figura 1
        System.out.println("Figura 1:\n");
        for(i=1;i<=limite;i++){
             for(j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
        }
            System.out.println();
            
            //Figura 2
            System.out.println("Figura 2:\n");
             for(i=1;i<=limite;i++){
                  for(j=1; j<=limite-i ; j++){
                    System.out.print(" ");
                  }
                  for (j = 1; j <=2 * i-1 ; j++) {
                      System.out.print("*");                     
                 }
                  System.out.println();
             }
             System.out.println();
             
           //Figura 3
          System.out.println("Figura 3:\n");
        for (i = 1; i <= limite; i++) {
            for ( j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for ( j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( i = limite - 1; i >= 1; i--) {
            for ( j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for ( j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
/***
 * Ingrese el limite que desea: 4
 Figura 1:

*
**
***
****

 Figura 2:

   *
  ***
 *****
*******

 Figura 3:

   *
  ***
 *****
*******
 *****
  ***
   *
BUILD SUCCESSFUL (total time: 2 seconds)

 */