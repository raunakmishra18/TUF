import java.util.*;
public class nto1recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of times u want to print your name in revers order");
        int n=sc.nextInt();
        function(n);
    }
    static void function(int n){
        if(n<1){
            return;
        }else{
            System.out.println(n);
            function(n-1);
        }
    }
    
}
