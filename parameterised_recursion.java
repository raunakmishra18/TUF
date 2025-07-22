import java.util.*;
public class parameterised_recursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        function(n,0);
    }static void function(int i ,int sum){
        if(i<1){
            System.out.println(sum);
            return;
            
        }else{
            function(i-1, sum+i);
        }
    
    }
    
}
