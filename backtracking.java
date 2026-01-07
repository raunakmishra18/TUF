import java.util.*;
public class backtracking {
    public static void main(String[] args) {
        System.out.println("enter the number how many u want to print");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        function(input);
        function2(input);
    }
    static void function(int i){
        if(i<1){
            return;
        }else{
            function(i-1);
            System.out.println(i);
        }
    }
    static void function2(int input){
        if(input<1){
            return;
        }else{
            System.out.println(input);
            function2(input-1);
        }
    }
}
