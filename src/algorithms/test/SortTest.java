package algorithms.test;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

    public static void main(String[] args) {
        int[] array = new int[21];
        for (int i = 0;i < array.length;i++){
            array[i] = new Random().nextInt(12);


    }
        Sort sort;
       //sort = new BubbleSort();
        //sort = new SelectSort();
       // sort = new QuickSort();
        sort = new MergeSort();

        sort.sort(array);

        System.out.println(Arrays.toString(array));







    }
}
