package KadanesAlgo;

public class SlidingWindow {


    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("MAX is = " + maxSunArraySumKadanesAlgo(arr));
    }

    public static int maxSunArraySumKadanesAlgo(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            max = Integer.max(currentSum, max);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return max;

    }

    public static int maxSubArrayBruteForce(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (sum > max) {
                max = sum;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;

    }
}
