package algorithms.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,5,6,3,4,23,412,123,532,3,1,23,5,324,13,3,1,34,2,43,24214};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }




    private static int[] sort(int[] arr){
        int[] temp;
        int[] currentSrc = arr;
        int[] currentDest = new int[arr.length];


        int size = 1;

        while (size < arr.length){
            for (int i = 0; i < arr.length; i += 2 * size){
                merge(currentSrc,i,currentSrc,i + size,currentDest,i,size);
            }
            temp = currentSrc;
            currentSrc = currentDest;
            currentDest = temp;

            size = size * 2;


        }
        return currentSrc;

    }






    public static void merge(int[] src1, int src1Start,int[] src2,int src2Start,int[] dest,
                             int destStart,int size) {
        int index1 = src1Start;
        int index2 = src2Start;


        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        if (src1Start + size > src1.length) {
            for (int i = src1Start; i < src1End; i++) {
                dest[i] = src1[i];
            }
            return;
        }

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }

        }
    }



}
