import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of row");
        int rows=sc.nextInt();
        System.out.println("enter the size of column");
        int col=sc.nextInt();
        int [][] arr=new int[rows][col];
        System.out.println(arr.length);
        System.out.println("enter the element of the array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            // for(int j=0;j<arr[i].length;j++){

            //     System.out.print(arr[i][j]+" ");
            // }
            //  System.out.println();
            System.out.println(Arrays.toString(arr[i]));
        }
       
    }
}
