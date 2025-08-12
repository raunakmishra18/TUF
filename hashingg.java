import java.util.*;
public class hashingg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[5];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int n =sc.nextInt();
            int result=hashing(arr, n);
            System.out.println(result);

    }
    static int hashing(int arr[],int n){
        int hash=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                hash=hash+1;
            }
        }
        return hash;
    }
    
}
