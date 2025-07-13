import java.util.*;
public class print_1_to_n {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number up to you want to print 1 to n");
        int nums=sc.nextInt();
        function(1,nums);

    } static void function(int i,int n){
        if(i>n){
            return;
        }else{
            System.out.println(i);
            function(i+1, n);

        }
            
        


        
    }
}
