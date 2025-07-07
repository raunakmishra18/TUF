import java.util.*;
public class recursionntimesprintname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of times u want to print your nzame");
        int n=sc.nextInt();
        function1(1, n);
    }static void function1(int i,int n){
        if(i>n){
            return;
        }else{
        System.out.println("raunak");
        function1(i+1, n);;
        }
        }
}

