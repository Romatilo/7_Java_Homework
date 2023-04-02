package tasks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class BubbleSort {
    public static int[] getBubbleSort(int[] array) throws IOException {
        FileWriter myWriter = new FileWriter("log.txt");
        int temp = 0;
        for (int j = 1; j < array.length - 1; j++) {
            for (int i = 0; i <= array.length - 1 - j; i++) {
                if (array[i] > array [i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            myWriter.write(Arrays.toString(array) + "\n");
        }
        myWriter.close();
        return array;
    }
}
