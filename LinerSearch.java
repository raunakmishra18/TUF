import java.util.*;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of RRy");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the element of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element u walt to find");
        int targent = sc.nextInt();
        int result = searchElement(arr, targent);
        System.out.println("result is " + result);
    }

    public static int searchElement(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                // System.out.println("element found i array"+index);
                // return index;
                return arr[index];
            }
        }
        System.out.println("element not in array");
        return -1;
    }
}
