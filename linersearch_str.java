// public class linersearch_str {
//     public static void main(String[] args) {
//         String name="raunak";
//         char  target='u';
//         System.out.println(search(name, target));
//     }
//     static boolean search( String str, char target ){
//         if (str.length()==0){
//             return false;
//         }
//         for(int  i=0;i<str.length();i++){
//             if (target==str.charAt(i)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
public class linersearch_str{
    public static void main(String[] args) {
        String name="chetan";
        char target='e';
        System.out.println(search2(name,target));

    }
    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
            return false;                                         
    }
}