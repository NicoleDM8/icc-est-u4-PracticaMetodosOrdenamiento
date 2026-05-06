import java.util.Arrays;

public class Insertion {

    public static int[] sort(int[] array, boolean asc) {

        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            System.out.println("\nI" + i);

            while (j >= 0) {

                boolean condicion = asc ? array[j] > key : array[j] < key;
                comparaciones++;

                System.out.printf("i=%-3d j=%-3d [a]=%-4d [b]=%-4d cambio=%s\n",
                        i, j, array[j], key, (condicion ? "si" : "no"));

                if (condicion) {
                    array[j + 1] = array[j];
                    j--;
                    cambios++;
                } else {
                    break;
                }
            }

            array[j + 1] = key;
            iteraciones++;

            System.out.println(Arrays.toString(array));
        }

        System.out.println("\nend " + Arrays.toString(array));
        System.out.println("COMPARACIONES: " + comparaciones);
        System.out.println("ITERACIONES: " + iteraciones);
        System.out.println("CAMBIOS: " + cambios);

        return new int[]{comparaciones, cambios, iteraciones};
    }
}