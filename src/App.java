import java.util.Scanner;
import java.util.Arrays;

public class App {

    static int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("PROGRAMA DE ORDENAMIENTO ");
            System.out.println("1. Ejecutar ordenamientos");
            System.out.println("2. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejecutar(sc);
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 2);

        sc.close();
    }

    public static void ejecutar(Scanner sc) {

        System.out.println("\nArreglo original: " + Arrays.toString(arreglo));

        System.out.print("¿Inserción ascendente? (true/false): ");
        boolean ascInsercion = sc.nextBoolean();

        System.out.print("¿Shell ascendente? (true/false): ");
        boolean ascShell = sc.nextBoolean();


        int[] copia1 = Arrays.copyOf(arreglo, arreglo.length);
        int[] copia2 = Arrays.copyOf(arreglo, arreglo.length);

        System.out.println("METODO INSERCIÓN");
        Insertion.sort(copia1, ascInsercion);

        System.out.println("METODO SHELL ");
        Shell.sort(copia2, ascShell);
    }
}