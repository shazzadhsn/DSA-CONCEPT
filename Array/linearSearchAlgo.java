import java.util.*;
public class linearSearchAlgo {
    public static int linearSearch(int numbers[], int keyElement) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == keyElement) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = {1, 2, 3, 5, 6};
        int keyElement = 5;

        int index = linearSearch(numbers, keyElement);

        if(index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at Index: " + index);
        }

        sc.close();
    }
}