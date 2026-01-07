public class recursion2 {
    public static void main(String[] args) {
        function(0);
    }
    static void function(int i){
        if(i>3){
            return;
        }else{
            System.out.println("hello");
            i++;
            function(i);
        }
        }
}
