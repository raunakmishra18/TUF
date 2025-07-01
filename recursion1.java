import java.util.*;
public class recursion1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        function(0,n);

    }
    static void function(int i,int n){
        if(i>n){
            return;
        }else{
            System.out.println(i);
            function(i+1,n);
        }
    }
}
