import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        swap(arr,1,5);
        System.out.println(Arrays.toString(arr));

    }
        static void swap(int [] arr,int index1, int index2){ {
        int temp=arr[1];
        arr[1]=arr[5];
        arr[5]=temp;
    }
}
}

