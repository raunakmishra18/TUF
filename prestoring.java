import java .util.*;
public class prestoring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int hash[]=new int [13];
            for(int i=0;i<n;i++){
                hash[arr[i]]++;
            }
            int q=sc.nextInt();
            while(q-->0){
                int num=sc.nextInt();
                System.out.println(hash[num]);
            }
    }
    
}
