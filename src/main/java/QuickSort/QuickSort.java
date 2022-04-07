package QuickSort;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {10, 16, 8, 12, 15, 6, 3, 9, 5};
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = Integer.MAX_VALUE;
        quickSort(newArr, 0, newArr.length - 1);
        for (int i = 0; i < newArr.length - 1; i++) {
            System.out.print(newArr[i]);
            System.out.print(",");
        }
    }


    public static int partition(int[] input, int l, int h) {
        int pivot = input[l];
        int i = l, j = h;
        while (i < j) {
            do {
                i++;
            } while (input[i] <= pivot);
            do {
                j--;
            } while (input[j] > pivot);

            if (i < j) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        int temp = input[l];
        input[l] = input[j];
        input[j] = temp;
        return j;
    }

    public static void quickSort(int[] inputArray, int l, int h) {
        if (l < h) {
            int j = partition(inputArray, l, h);
            quickSort(inputArray, l, j);
            quickSort(inputArray, j + 1, h);
        } else {
            return;
        }
    }
}
