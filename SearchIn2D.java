import java.util.*;
public class SearchIn2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the element in the array");
        int [][] arr=new int[3][3];
         System.out.println("enter the element in the array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
                // System.out.println(Arrays.toString[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("enter the target");
        int target =sc.nextInt();
        int[] result=search(arr, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
             
        }
       return new int []{-1,-1};
    }
}
