import java.util.*;

public class maximumSubarrayKadanes {
    public static int maximumSubarraySum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];
            if(currentSum < 0) {
                currentSum = 0;
            }
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = maximumSubarraySum(numbers);

        System.out.println("Maximum Subarray Sum: " + maxSum);

        sc.close();
    }
}