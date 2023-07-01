import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int maxSum = findMaximumSumSubarray(arr);
            System.out.println(maxSum);
        }

        scanner.close();
    }

    public static int findMaximumSumSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                start = i + 1;
            }
        }

        // If all elements are negative, return the maximum element
        if (maxSum < 0) {
            maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxSum) {
                    maxSum = arr[i];
                    start = i;
                    end = i;
                }
            }
        }

        return maxSum;
    }
}
