import java.util.*;
public class arrray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int[] arr= new int[5];
        // for(int i=0;i<arr.length;i++){
        //     System.out.print("Enter the value for index " + i + ": ");
        //     arr[i]=sc.nextInt();
        // }
        String[] name=new String[4];
        for(int i=0;i<name.length;i++){
            System.out.print("Enter the value for index " + i + ": ");
            name[i]=sc.nextLine();
        }

        System.out.println(Arrays.toString(name));

    }
}
