package algorithms.test;

public class SelectSort extends Sort{
    @Override
    public void sort(int[] arr) {
        int step = 0;

        for (int i = step;i<arr.length;i++){
            int temp = arr[i];
            int minIndex = findMinElementsIndex(arr,i);
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    private int findMinElementsIndex(int[] arr,int start){
        int minValue = arr[start];
        int minIndex = start;

        for (int i = start;i< arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
                minIndex = i;

            }
        }

        return minIndex;

    }
}
