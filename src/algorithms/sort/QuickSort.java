package algorithms.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,5,6,8,88,676,54,3,22,1,0,657,46};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }




    private static void sort(int[] arr,int from,int to){
        if (from < to){
            int divideIndex = partition(arr,from,to);
            sort(arr,from,divideIndex-1);
            sort(arr,divideIndex,to);
        }
    }





    private static int partition(int[] arr,int from,int to){
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];

        while (leftIndex <= rightIndex){

            while (arr[leftIndex] < pivot){
                leftIndex++;
            }
            while (arr[rightIndex] > pivot){
                rightIndex--;
            }

            if (leftIndex <= rightIndex){
                swap(arr,leftIndex,rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] arr, int leftIndex, int rightIndex) {
        int temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }
}
