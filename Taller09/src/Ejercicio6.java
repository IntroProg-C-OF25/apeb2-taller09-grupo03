
/** *
 *Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese por teclado una letra que coincida con la primera letra de los "nombres" contenidos en del arreglo estudiantes.
 * Debe usar un ciclo repetitivo para recorrer el arreglo estudiantes, y no quemar de forma constante dichas iniciales, imagine que estudiantes podría contener millón de nombres, por lo que fijar iniciales, es ineficiente.
 * author@Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String estudiantes []= {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        int cont;
        char primeraLetra;
        
        while (bandera) {
            System.out.println("Ingrese una letra:");
            inicial = tcl.nextLine(); 
            for (cont = 0; cont < estudiantes.length; cont++) {
                 primeraLetra = estudiantes[cont].charAt(0);
                  if (Character.toUpperCase(inicial.charAt(0)) == Character.toUpperCase(primeraLetra)) {
                    System.out.println("La letra ingresada coincide con la inicial de: " + estudiantes[cont]);
                    bandera= false;
                    break;
                    
            }

    }
            if (bandera) {
                System.out.println("No se encontró ninguna coincidencia. Intente nuevamente.");
            }
}
        tcl.close();
}
}
/***
 * run:
 * Ingrese una letra:
 * k
 * La letra ingresada coincide con la inicial de: Kimberly
 * BUILD SUCCESSFUL (total time: 2 seconds)

 */