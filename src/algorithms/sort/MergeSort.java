package algorithms.sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[21];
        for (int i = 0;i < array.length;i++){
            array[i] = new Random().nextInt(12);


        }
        sort(array);
        System.out.println(Arrays.toString(array));
    }



    private static int[] sort(int[] array){
        int[] currentArr = array;
        int[] destArray = new int[array.length];
        int[] temp;

        int size = 1;

        while (size < array.length){

            for (int i = 0;i < array.length;i = i + size * 2){
                merge(currentArr,i,currentArr,i + size,destArray,i,size);
            }
            temp = destArray;
            destArray = currentArr;
            currentArr = temp;

            size = size * 2;

        }

        return currentArr;

    }


    private static void merge(int[] currentArr1, int currentArr1Start, int[] currentArr2, int currentArray2Start,
                              int[] destArray, int destArrayStart,int size){
        int index1 = currentArr1Start;
        int index2 = currentArray2Start;

        int currentArr1End = Math.min(currentArr1Start + size,currentArr1.length);
        int currentArr2End = Math.min(currentArray2Start + size, currentArr2.length);


        int iterationCount = currentArr1End - currentArr1Start + currentArr2End - currentArray2Start;

        for (int i = destArrayStart; i < destArrayStart + iterationCount;i++){
            if (index1 < currentArr1End && (!(index2 < currentArr2End) || currentArr1[index1] < currentArr2[index2])){
                destArray[i] = currentArr1[index1];
                index1++;

            }
            else {
                destArray[i] = currentArr2[index2];
                index2++;
            }
        }

    }



}
