package algorithms.sort;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[]arr = new int[]{1, 4, 2, 4, 1, 65, 3, 6, 7, 8, 80, 6, 4, 5, 3};
        System.out.println(Arrays.toString(sort(arr)));

    }



    private static int[] sort(int[] arr){
        for (int step = 0; step < arr.length; step++){
            int temp = arr[step];
            int minElementIndex = findMinValue(arr,step);
            arr[step] = arr[minElementIndex];
            arr[minElementIndex] = temp;


        }
        return arr;

    }



    private static int findMinValue(int[] arr,int start){
        int minValue = arr[start];
        int minIndex = start;

        for (int i = start+1;i<arr.length;i++){
            if (arr[i] < minValue){
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }
}
