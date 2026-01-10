import java.util.*;

public class sumofn_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number upto which u want sum");
        int n=sc.nextInt();
        function(n,0);
    }
    static void function(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        function(i-1,sum+i);
    }
}