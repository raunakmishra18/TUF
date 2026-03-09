import java.util.*;
public class FindMinNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the element in array");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }
        int result=findMin(arr);
        System.out.println(result);

    }
    static int findMin(int []arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    
}
