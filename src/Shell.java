import java.util.Arrays;

public class Shell {

    public static int[] sort(int[] array, boolean asc) {

        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        int n = array.length;

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(array));

        for (int gap = n / 2; gap > 0; gap = gap / 2) {

            System.out.println("\nGAP = " + gap);

            for (int i = gap; i < n; i++) {

                int temp = array[i];
                int j = i;

                System.out.println("\ni=" + i);

                while (j >= gap) {

                    boolean condicion = asc ? array[j - gap] > temp : array[j - gap] < temp;
                    comparaciones++;

                    System.out.printf("i=%-3d j=%-3d [a]=%-4d [b]=%-4d cambio=%s\n",
                            i, j, array[j - gap], temp, (condicion ? "si" : "no"));

                    if (condicion) {
                        array[j] = array[j - gap];
                        j = j - gap;
                        cambios++;
                    } else {
                        break;
                    }
                }

                array[j] = temp;
                iteraciones++;

                System.out.println(Arrays.toString(array));
            }
        }

        System.out.println("\nend " + Arrays.toString(array));
        System.out.println("COMPARACIONES: " + comparaciones);
        System.out.println("ITERACIONES: " + iteraciones);
        System.out.println("CAMBIOS: " + cambios);

        return new int[]{comparaciones, cambios, iteraciones};
    }
}