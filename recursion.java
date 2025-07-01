public class recursion {
    public static void main(String[] args) {
        function2(0);

    }
    // static void function(){
    //     System.out.println("1");
    //     function();
    // }

    static void function2(int i){
        if (i==3) {
            return;
        }else{
            System.out.println(i);
            // i++;
            function2(i+1);
        }
    }
}
