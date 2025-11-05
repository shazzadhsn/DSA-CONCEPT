import java.util.*;

public class maximumSubarrayPrefixArray {
    public static int maximumSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        // prefix array creation
        int prefixArray[] = new int[numbers.length];
        prefixArray[0] = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + numbers[i];
        }

        // maximum Subarray Sum identification
        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                // negative index handling
                if(start == 0) {
                    currSum = prefixArray[end];
                } else { // current sum calculation for each subarray
                    currSum = prefixArray[end] - prefixArray[start - 1];
                }

                // maximum sum calculation after each subarray sum calculation
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = {1, -2, 6, -1, 3};
        int maxSum = maximumSubarraySum(numbers);

        System.out.println("Maximum Subarray Sum: " + maxSum);

        sc.close();
    }
}
