package algorithms;

public class BubbleSort {
    public int[] sort(int[] array) {
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length - i; j++) {
                if(array[j-1] > array[j]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
}
