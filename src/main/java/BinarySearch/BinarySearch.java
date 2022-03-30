package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 25, -20, 10, 23, 52, 18};
        System.out.println(binarySearch(arr, 10));
        System.out.println(binarySearch(arr, 80));
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

    public static int binarySearch(int[] arr, int searchValue) {
        return recursiveBinarySearch(arr, 0, arr.length, searchValue);
    }

    private static int recursiveBinarySearch(int[] arr, int start, int end, int searchValue) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == searchValue) {
            return mid;
        } else if (arr[mid] < searchValue) {
            start = mid + 1;
            return recursiveBinarySearch(arr, start, end, searchValue);
        } else {
            end = mid;
            return recursiveBinarySearch(arr, start, end, searchValue);
        }
    }
}
