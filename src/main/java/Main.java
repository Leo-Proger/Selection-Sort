public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 3, 6};
        int[] sortedArray = SelectionSort.sort(array);

        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
    }
}

