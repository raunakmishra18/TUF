import java.util.Arrays;

public class PassingFunctionArray {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void change(int arr[]){
        arr[2]=30;
        arr[4]=34;

    }
}
