import java.util.*;
public class backtracking {
    public static void main(String[] args) {
        System.out.println("enter the number how many u want to print");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        function(input);
    }
    static void function(int i){
        if(i<1){
            return;
        }else{
            function(i-1);
            System.out.println(i);
        }
    }
}
