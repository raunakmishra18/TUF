import java.util.Scanner;
public class hashing2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int n =sc.nextInt();
        int result=hash(arr,n);
        System.out.println(result);
    }
    static int hash(int arr[], int  n){
        int hash=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==n){
                hash=hash+1;
            }
        }
        return hash;
    }
}
