
/**
 *Genera una aplicación que permita ingresar valores a un arreglo de cadenas. El arreglo almacena el número de elementos que el usuario lo disponga. Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.
 *Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe permitir ingresar ese número elementos.
 *Considerar las siguientes excepciones, no se contabilizan dentro del número de elementos, marcas que empiecen con las letras A, C, T.
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        String marca = "";
        int numMarcas, cont;
        char primLetra;

        System.out.print("Ingrese el numero de marcas de autos que desea almacenar: ");
        numMarcas = tcl.nextInt();
        tcl.nextLine();

        String marcas[] = new String[numMarcas]; // Se lo inicializa en este punto porque al inicalizarlo antes nos indica error ya que el valor al array se agrega en esta linea por el usuario
        System.out.println("Ingrese la marcas de los vehiculos: ");
        for (cont = 0; cont < numMarcas;) {
            System.out.print("Marca " + (cont + 1) + ": ");
            marca = tcl.nextLine();
            primLetra = Character.toUpperCase(marca.charAt(0));
            if (primLetra == 'A' || primLetra == 'C' | primLetra == 'T') {
                System.out.println("La marca no es valida  empieza con la letra A , C o T . Ingrese otra marca: ");
                continue;
            }
            marcas[cont] = marca;
            cont++;
        }
        System.out.println("\n Marcas almacenadas:");
        for (cont = 0; cont < marcas.length; cont++) {
            System.out.println(marcas[cont]);
        }
        tcl.close();
    }
}
/***
 * run:
 *Ingrese el numero de marcas de autos que desea almacenar: 5
 *Ingrese la marcas de los vehiculos: 
 *Marca 1: AUDI
 *La marca no es valida  empieza con la letra A , C o T . Ingrese otra marca: 
 *Marca 1: FORD
 *Marca 2: KIA
 *Marca 3: CHEVROLET
 *La marca no es valida  empieza con la letra A , C o T . Ingrese otra marca: 
 *Marca 3: BMW
 *Marca 4: NISSAN
 *Marca 5: FERRARI

  *Marcas almacenadas:
 *FORD
 *KIA
 *BMW
 *NISSAN
 *FERRARI
 *BUILD SUCCESSFUL (total time: 34 seconds)
 */
