import java.util.*;
public class Insertion_Sort {
    public static void insertionSort(int arr[], int n) {
        // outer loop
        for(int i=1; i<=(n-1); i++) {
            int curr = arr[i];
            int prev = i-1;
            // inner loop (picking from unsorted, placing to sorted)
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {5, 4, 1, 3, 2};
        int arrLen = arr.length;
        
        insertionSort(arr, arrLen);

        for(int i=0; i<arrLen; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
