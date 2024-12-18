/*
 * Escriba un programa que permita presentar la siguiente serie:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos 
 */

/**
 *
 * @author Chente15
 */
public class Ejercicio2_Serie {
    public static void main(String[] args) {
        int limite = 10; 
        int fibo1 = 1, fibo2 = 1; 
        int fibonacci, numeroPrimo = 2; 
        boolean esPrimo;
        System.out.println("Serie Fibonacci / Primos:");
        for (int i = 0; i < limite; i++) {
            System.out.print(fibo1 + "/" + numeroPrimo + ", ");

            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

            for (int j = numeroPrimo + 1; ; j++) { 
                esPrimo = true;
                for (int k = 2; k <= j / 2; k++) {
                    if (j % k == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) { 
                    numeroPrimo = j;
                    break;
                }
            }
        }
        System.out.println(); 
    }
}
/**
 * run:
 * Serie Fibonacci / Primos:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, 13/17, 21/19, 34/23, 55/29, 
 */
       

    

