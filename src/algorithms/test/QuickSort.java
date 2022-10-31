package algorithms.test;

public class QuickSort extends Sort{
    @Override
    public void sort(int[] arr) {
        int from = 0;
        int to = arr.length - 1;
        if (from < to){
            int div = partition(arr,from,to);
            sort(arr,from,div-1);
            sort(arr,div,to);
        }

    }
    public void sort(int[] arr,int from,int to){
        if (from < to){
            int div = partition(arr,from,to);
            sort(arr,from,div-1);
            sort(arr,div,to);
        }

    }



    private int partition(int[] array,int from,int to){
        int leftIndex = from;
        int rightIndex = to;

        int pivotElement = array[from + (to - from)/2];

        while (leftIndex <= rightIndex){

            while (array[leftIndex] < pivotElement){
                leftIndex++;
            }

            while (array[rightIndex] > pivotElement){
                rightIndex--;

            }

            if (leftIndex <= rightIndex){
                swap(array,leftIndex,rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;


    }

    private void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
}
