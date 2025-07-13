import java.util.*;

public class nto1recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times u want to print your name in revers order");
        int n = sc.nextInt();
        // function(n);
        // function2(1, n);
        // finalFunction(n);
        function3(n, 1);
    }

    static void function(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        function(n - 1);
    }

    static void function2(int a, int n){
        if(a>n){
            return;
        }
        System.out.println(a);
        function2(a+1, n);
    }

    static void finalFunction(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        finalFunction(n-1);
        System.out.println(n);
    }
    static void function3(int n, int i){
        if(n<1){
            return;
        }
        System.out.println(n + " "+ i);
        function3(n-1, i+1);
        // System.out.println(n);
    }

}
