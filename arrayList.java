import java.util.*;
import java.awt.List;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> List=new ArrayList<>(10);
        // List.add(10);
        // List.add(20);
        // List.add(30);
        // List.add(40);
        // List.add(50);
        // List.add(60);
        // List.add(70);
        // List.add(80);
        // List.add(90);
        // List.add(100);
        // List.add(110);
        // List.add(120);
        // List.add(130);
        // List.add(140);
        // List.add(150);
        // List.add(160);
        // List.add(170);
        // List.add(180);
        // List.add(190);
        // List.add(200);
        // List.add(210);
        // System.out.println(List);

        // System.out.println(List.size()); // Size of the ArrayList
        // List.set(3,23);
        // System.out.println(List);
        // List.remove(3); // Remove element at index 3
        // System.out.println(List);

        // INPUT FROM USER
        for(int i=0;i<10;i++){
            List.add(sc.nextInt());
        }
        for(int i=0;i<10;i++){
            System.out.println(List.get(i)); // Increment each element by 5
        }
        System.out.println(List);
    }
}
