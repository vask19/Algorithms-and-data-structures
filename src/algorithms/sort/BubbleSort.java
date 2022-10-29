package algorithms.sort;
public class BubbleSort {
    public static void main(String[] args) {
    }
    public static int[] find(int[] arr){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for (int i =0;i<arr.length-1;i++){
                if (arr[i+1] < arr[i]){
                    isSorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}
