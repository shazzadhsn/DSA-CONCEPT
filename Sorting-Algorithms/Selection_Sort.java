import java.util.*;
public class Selection_Sort {
    public static void selectionSort(int arr[], int n) {
        // outer loop
        for(int i = 0; i <= (n-2); i++) {
            int minPos = i;
            // inner loop
            for(int j = i + 1; j <= (n-1); j++) {
                // smallest pos finding each iteration
                if(arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {5, 4, 1, 3, 2};
        int arrLen = arr.length;

        selectionSort(arr, arrLen);

        // print array
        for(int i=0; i<arrLen; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
