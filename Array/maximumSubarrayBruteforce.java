import java.util.*;
public class maximumSubarrayBruteforce {
    public static int maximumSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
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