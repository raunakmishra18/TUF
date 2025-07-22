import java.util.*;
public class factorialinrecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nimber u want to print the factorial");
        int n=sc.nextInt();
        int result=function(n);
        System.out.println(result);
    }static int function(int n){
        if (n==0) {
            return 1;
        }else{
            return n*function(n-1);
        }
    }

}
