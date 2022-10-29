package algorithms.find;

public class FindMaxElement {
    public static void main(String[] args) {
        System.out.println(find(new int[]{1,5,43,2,66,5,42,44}));
    }
    public static int find(int[] arr){
        int temp;
        int max = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
