import java.util.*;
public class arr_revesreinrecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        function(arr,0,n-1);
        System.out.println("the reversed array is");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void function(int arr[],int l,int r){
        if (l>=r) {
            return;
        }else{
            int swap=arr[l];
            arr[l]=arr[r];
            arr[r]=swap;
            function(arr,l+1,r-1);
        }

    }
}
