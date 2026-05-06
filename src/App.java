import java.util.Scanner;
import java.util.Arrays;

public class App {

    static int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 2) {

            System.out.println("\nMENU");
            System.out.println("1. Ejecutar ordenamientos");
            System.out.println("2. Salir");
            System.out.print("Seleccione: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {

                System.out.println("\nArreglo original: " + Arrays.toString(arreglo));

                System.out.print("Insercion ascendente (true/false): ");
                boolean asc1 = scanner.nextBoolean();

                System.out.print("Shell ascendente (true/false): ");
                boolean asc2 = scanner.nextBoolean();

                int[] copia1 = arreglo.clone();
                int[] copia2 = arreglo.clone();

                System.out.println("\n===== METODO INSERCION =====");
                int[] res1 = Insertion.sort(copia1, asc1);

                System.out.println("\n===== METODO SHELL =====");
                int[] res2 = Shell.sort(copia2, asc2);

                System.out.println("\n===== RESUMEN =====");
                System.out.println("Insercion - Comparaciones: " + res1[0] +
                                   ", Cambios: " + res1[1] +
                                   ", Iteraciones: " + res1[2]);

                System.out.println("Shell - Comparaciones: " + res2[0] +
                                   ", Cambios: " + res2[1] +
                                   ", Iteraciones: " + res2[2]);
            } 
            else if (opcion != 2) {
                System.out.println("Opcion invalida");
            }
        }

        scanner.close();
        System.out.println("Fin del programa");
    }
}