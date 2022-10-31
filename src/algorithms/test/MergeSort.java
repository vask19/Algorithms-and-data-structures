package algorithms.test;

public class MergeSort extends Sort{
    @Override
    public void sort(int[] arr) {
        int[] currentArray = arr;
        int[] destArray = new int[arr.length];
        int[] temp;

        int size = 1;

        while (size < arr.length){

            for (int i = 0; i < arr.length;i = i + size * 2){
                merge(currentArray,i,currentArray,i + size,destArray,i,size);
            }
            temp = destArray;
            destArray = currentArray;
            currentArray = temp;

            size = size * 2;
        }

    }

    private void merge(int[] currentArray1, int currentArray1Start, int[] currentArray2,
                       int currentArray2Start, int[] destArray, int destArrayStart, int size) {

        int index1 = currentArray1Start;
        int index2 = currentArray2Start;

        int currentArrays1End = Math.min(currentArray1Start + size,currentArray1.length);
        int currentArrays2End = Math.min(currentArray2Start + size,currentArray2.length);

        int iterableCount = currentArrays1End - currentArray1Start + currentArrays2End - currentArray2Start;

        for (int i = destArrayStart; i < destArrayStart + iterableCount;i++){
            if (index1 < currentArrays1End &&
                    (!(index2 < currentArrays2End) || currentArray1[index1] < currentArray2[index2])){
                destArray[i] = currentArray1[index1];
                index1++;
            }
            else{
                destArray[i] = currentArray2[index2];
                index2++;

            }


        }
    }


}
