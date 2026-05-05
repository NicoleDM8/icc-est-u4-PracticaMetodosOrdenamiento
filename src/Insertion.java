import java.util.Arrays;

public class Insertion {

    public static void sort(int[] array, boolean asc) {

        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && (asc ? array[j] > key : array[j] < key)) {
                comparaciones++;

                array[j + 1] = array[j];
                j--;
                cambios++;

                System.out.println("Paso: " + Arrays.toString(array));
            }

            array[j + 1] = key;
            iteraciones++;
        }

        System.out.println("Resultado: " + Arrays.toString(array));
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        System.out.println("Iteraciones: " + iteraciones);
    }
}