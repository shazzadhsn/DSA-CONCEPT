import java.util.*;
public class binarySearchAlgo {
    public static int binarySearch(int numbers[], int keyElement) {
        int startIndex = 0;
        int endIndex = numbers.length - 1;
        
        while(startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            if(keyElement == numbers[midIndex]) {
                return midIndex;
            }
            if(keyElement > numbers[midIndex]) {
                startIndex = midIndex + 1;
            }
            if(keyElement < numbers[midIndex]) {
                endIndex = midIndex - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array must be sorted
        int numbers[] = {1, 2, 3, 5, 6, 9};
        int keyElement = 6;

        int index = binarySearch(numbers, keyElement);

        if(index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at Index: " + index);
        }
        
        sc.close();
    }
}
