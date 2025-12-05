import java.util.*;
public class Counting_Sort {
    public static void countingSort(int arr[], int n) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<n; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {5, 4, 1, 3, 2};
        int arrLen = arr.length;

        countingSort(arr, arrLen);

        for(int i=0; i<arrLen; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
