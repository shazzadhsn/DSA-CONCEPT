import java.util.*;
public class Bubble_Sort {
    public static void bubbleSort(int arr[], int n) {
        // outer loop
        for(int i = 0; i <= n-2; i++) {
            // inner loop
            for(int j = 0; j <= (n-2-i); j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {5, 4, 1, 3, 2};
        int arrLen = arr.length;

        bubbleSort(arr, arrLen);

        // print final sorted array
        for(int i = 0; i < arrLen; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
