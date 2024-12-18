

/**
 *Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.
 * int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 * @author Daniel Matute
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma =0 , media;
        int arribaMedia=0, abajoMedia=0, cont;
        //Calcular la media aritmetica
        for (cont= 0; cont < arreglo.length; cont++) {
            suma+=arreglo[cont];
        }
        media = suma / arreglo.length;
        
        for (cont = 0;  cont< arreglo.length; cont++) {
            if(arreglo[cont]>media){
                arribaMedia++;
            } else if(arreglo[cont]< media){
                abajoMedia++;
            }
        }
        System.out.println("Arreglo:  ");
        for (cont= 0; cont < arreglo.length; cont++) {
            System.out.print(arreglo[cont]+ " ");
        }
        System.out.println("\nMedia Artimetica es:"+media);
        System.out.println("Elementos arriba de la media son:"+arribaMedia);
        System.out.println("Elementos abajo de la media son:"+abajoMedia);
    }
}
/***
 * run:
 *Arreglo:  
 * 1 10 11 12 12 13 16 2 3 4 9 10 21 
 *Media Artimetica es:9.538461538461538
 *Elementos arriba de la media son: 8
 *Elementos abajo de la media son: 5
 *BUILD SUCCESSFUL (total time: 0 seconds)
 */