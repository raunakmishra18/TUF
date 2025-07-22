
import java.util.*;
public class functionalRecursion {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int result = function(n);
        System.out.println(result);
    }static int function(int n){
        if(n==0){
            return 0;
        }else{
            return n + function(n-1);
        }
    }
}
