import algorithms.BubbleSort;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");

        int[] vet = { 5, 3, 8, 9, 0 };

        System.out.println("Initial Array:");
        for (int i : vet) {
            System.out.print(i + " ");
        }

        BubbleSort bubbleSort = new BubbleSort();

        System.out.println("\nSorted Array:");
        for (int i : bubbleSort.sort(vet)) {
            System.out.print(i + " ");
        }
    }
}