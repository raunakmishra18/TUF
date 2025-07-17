import java.util.*;
public class backtrackingrecurssion1ton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number of times u want to print the number in reverse order ");
        int n =sc.nextInt();
        function(1,n);
    }static void function(int i,int n){
        if (i>n) {
            return;
        }else{
            // function(i-1,n);
            System.out.println(i);
            function(i+1,n);
        }
    }
}