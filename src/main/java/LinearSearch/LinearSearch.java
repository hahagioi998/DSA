package LinearSearch;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {1, 25, -20, 10, 23, 52, 18};
        System.out.println(linearSearch(arr,18));
        System.out.println(linearSearch(arr,0));
    }

    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) return i;
        }
        return -1;
    }
}
