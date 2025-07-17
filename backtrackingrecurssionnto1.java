import java.util.*;
public class backtrackingrecurssionnto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rhe number of times u want to print your name in reverse order");
        int n=sc.nextInt();
        function(1,n);
    }static void function(int i,int n){
        if (i>n) {
            return;
        }else{
            function(i+1,n);
            System.out.println(i);
        }
    }
    
}
