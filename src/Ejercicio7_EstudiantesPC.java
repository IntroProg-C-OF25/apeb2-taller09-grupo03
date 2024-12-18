/*
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas en función a los promedios obtenidos del ciclo por estudiantes 
 * (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).
 * Promedio del ciclo, del paralelo C.
 * Listado de estudiantes con su nota por encima del promedio.
 * Listado de estudiantes con su nota por debajo del promedio.
 * Estudiante con la mejor calificación.
 * Estudiante con la calificación mas baja.
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Random;

public class Ejercicio7_EstudiantesPC {

    public static void main(String[] args) {
        double suma = 0, promedioCiclo = 0, mejorPromedio = 0, peorPromedio;
        String mejorEstu, peorEstu;
        String[] estudiantes = {
            "Estudiante 1", "Estudiante 2", "Estudiante 3", "Estudiante 4", "Estudiante 5",
            "Estudiante 6", "Estudiante 7", "Estudiante 8", "Estudiante 9", "Estudiante 10",
            "Estudiante 11", "Estudiante 12", "Estudiante 13", "Estudiante 14", "Estudiante 15",
            "Estudiante 16", "Estudiante 17", "Estudiante 18", "Estudiante 19", "Estudiante 20",
            "Estudiante 21", "Estudiante 22", "Estudiante 23", "Estudiante 24", "Estudiante 25",
            "Estudiante 26", "Estudiante 27", "Estudiante 28"
        };
        double[] promedios = new double[28];
        Random random = new Random();
        for (int i = 0; i < promedios.length; i++) {
            promedios[i] = 4 + random.nextDouble() * 6;
        }
        for (int i = 0; i < promedios.length; i++) {
            suma += promedios[i];
        }
        promedioCiclo = suma / promedios.length;
        mejorPromedio = promedios[0];
        peorPromedio = promedios[0];
        mejorEstu = estudiantes[0];
        peorEstu = estudiantes[0];

        for (int i = 1; i < promedios.length; i++) {
            if (promedios[i] > mejorPromedio) {
                mejorPromedio = promedios[i];
                mejorEstu = estudiantes[i];
            }
            if (promedios[i] < peorPromedio) {
                peorPromedio = promedios[i];
                peorEstu = estudiantes[i];
            }
        }

        System.out.printf("Promedio del ciclo: %.2f%n", promedioCiclo);

        System.out.println("\nEstudiantes con nota por encima del promedio:");
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] > promedioCiclo) {
                System.out.printf("%s con promedio: %.2f%n", estudiantes[i], promedios[i]);
            }
        }

        System.out.println("\nEstudiantes con nota por debajo del promedio:");
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] < promedioCiclo) {
                System.out.printf("%s con promedio: %.2f%n", estudiantes[i], promedios[i]);
            }
        }

        System.out.printf("%nEstudiante con la mejor calificacion: %s con promedio: %.2f%n", mejorEstu, mejorPromedio);
        System.out.printf("Estudiante con la calificacion mas baja: %s con promedio: %.2f%n", peorEstu, peorPromedio);
    }
}
/**
 * Promedio del ciclo: 7,31

 * Estudiantes con nota por encima del promedio:
 * Estudiante 4 con promedio: 7,90
 * Estudiante 5 con promedio: 7,87
 * Estudiante 7 con promedio: 9,62
 * Estudiante 8 con promedio: 8,56
 * Estudiante 11 con promedio: 8,61
 * Estudiante 12 con promedio: 8,07
 * Estudiante 14 con promedio: 8,49
 * Estudiante 18 con promedio: 9,82
 * Estudiante 21 con promedio: 9,38
 * Estudiante 22 con promedio: 8,35
 * Estudiante 24 con promedio: 7,59
 * Estudiante 25 con promedio: 7,35
 * Estudiante 28 con promedio: 9,50

*  Estudiantes con nota por debajo del promedio:
*  Estudiante 1 con promedio: 6,37
*  Estudiante 2 con promedio: 5,26
*  Estudiante 3 con promedio: 6,46
*  Estudiante 6 con promedio: 4,90
*  Estudiante 9 con promedio: 6,09
*  Estudiante 10 con promedio: 6,31
*  Estudiante 13 con promedio: 7,07
*  Estudiante 15 con promedio: 5,08
*  Estudiante 16 con promedio: 5,83
*  Estudiante 17 con promedio: 6,62
*  Estudiante 19 con promedio: 5,47
*  Estudiante 20 con promedio: 6,82
*  Estudiante 23 con promedio: 6,89
*  Estudiante 26 con promedio: 7,10
*  Estudiante 27 con promedio: 7,27

  Estudiante con la mejor calificacion: Estudiante 18 con promedio: 9,82
  Estudiante con la calificacion mas baja: Estudiante 6 con promedio: 4,90
 */
