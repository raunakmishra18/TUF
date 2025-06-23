import java.util.Arrays;

public class reversee {
    public static void main(String[] args) {
        int [] arr={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move towards the middle
            start++;
            end--;
        }
    }
}
