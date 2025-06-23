import java.util.*;
public class twoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]= new int[3][3];
        System.out.println(arr.length); // Number of rows
        // for(int i=0;i<arr.length;i++){
        //     for(int col=0;col<arr[i].length;col++){
        //         arr[i][col]=sc.nextInt();
        //         // System.out.println(arr[i][col] +" ");
        //     }
        // }
        for(int i=0;i<arr.length;i++){
            // System.out.println(Arrays.toString(arr[i]));
            for(int col=0;col<arr[i].length;col++){
                arr[i][col]=sc.nextInt();
                System.out.print(arr[i][col] +" ");
            }
            System.out.println();
        }
    }
}

