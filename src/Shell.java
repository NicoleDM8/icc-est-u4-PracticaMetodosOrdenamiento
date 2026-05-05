import java.util.Arrays;

public class Shell {

    public static void sort(int[] array, boolean asc) {

        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i;

                while (j >= gap && (asc ? array[j - gap] > temp : array[j - gap] < temp)) {
                    comparaciones++;

                    array[j] = array[j - gap];
                    j -= gap;
                    cambios++;

                    System.out.println("Paso: " + Arrays.toString(array));
                }

                array[j] = temp;
                iteraciones++;
            }
        }

        System.out.println("Resultado: " + Arrays.toString(array));
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        System.out.println("Iteraciones: " + iteraciones);
    }
}