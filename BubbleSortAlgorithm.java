import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSortAlgorithm implements SortAlgorithm {
    public void sort (int[] array){
        int n = array.length;
        int temp = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n-i); j++) {
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Mảng sắp xếp bằng thuật toán sx nổi bọt:");
        System.out.println(Arrays.toString(array));
    }
}
