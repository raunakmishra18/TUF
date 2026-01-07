import java.util.*;
public class onetonrecurssion {
    public static void main(String[] args) {
        System.out.println("print 1 to n using recursion");
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("print n to 1 using recursion");
        function(0,n);
        System.out.println("print 2 to n using recursion");
        function2(0,n);

    }
    static void function(int i,int n){
        if(n==0){
            return;

        }
        else{
            System.out.println(n);
            n--;
            function(i, n);
        }
    }
    static void function2(int i,int n){
        if(i>n){
            return;

        }
        else{
            System.out.println(i);
            i++;
            function2(i, n);
        }
    }
}
