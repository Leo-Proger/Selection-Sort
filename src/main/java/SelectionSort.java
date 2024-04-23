public class SelectionSort {
    public static int[] sort(int[] arr) {
        int tmp;

        for (int ind = 0, left = 0; ind < arr.length; ind++, left++) {
            int smallestIndex = findMin(arr, ind);

            tmp = arr[left];
            arr[left] = arr[smallestIndex];
            arr[smallestIndex] = tmp;
        }
        return arr;
    }

    private static int findMin(int[] arr, int start) {
        int smallestIndex = start;

        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
