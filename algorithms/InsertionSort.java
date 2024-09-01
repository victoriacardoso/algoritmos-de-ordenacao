package algorithms;

public class InsertionSort {

    public int[] sort(int[] array) {
        int pivot;
        for (int i = 1; i < array.length; i++) {
            pivot = array[i];
            int j = i - 1;

            while(j >= 0 && pivot < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = pivot;
        }

        return array;
    }
}