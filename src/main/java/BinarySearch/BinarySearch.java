package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 25, -20, 10, 23, 52, 18};
        System.out.println(iterativeBinarySearch(arr,10));
        System.out.println(iterativeBinarySearch(arr,80));
    }

    public static int iterativeBinarySearch(int[] arr, int searchValue) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == searchValue) {
                return mid;
            } else if (arr[mid] < searchValue) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
