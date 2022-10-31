package algorithms.test;

public class BubbleSort extends Sort{


    @Override
    public void sort(int[] arr) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < arr.length -1 ; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
