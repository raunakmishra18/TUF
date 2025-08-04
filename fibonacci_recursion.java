import java.util.*;
public class fibonacci_recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to find the fibonacci of");
        int n=sc.nextInt();
        int result=fibonacci(n);
        System.out.println("The Fibonacci of " + n + " is: " + result);
    }
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            int fib1= fibonacci(n-1);
            int fib2=fibonacci(n-2);
            return fib1+fib2;
        }
    }
}
