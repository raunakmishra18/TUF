import java.util.*;
public class LinerSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of RRy");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the element of the array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
}
