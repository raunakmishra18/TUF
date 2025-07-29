import java.util.*;
public class palindrom_recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String str=sc.nextLine();
        boolean result=isPalindrome(0, str);
        if(result)
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
    }
    static boolean isPalindrome(int i , String str){
        if (i>= str.length()/2) {
            return true;
        } if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
            return false;
        }else{
            return isPalindrome(i+1, str);
        }


    }
}
