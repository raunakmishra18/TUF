public class max {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(maxrang(arr,1,5));
    }
    // MAX VAILUE IN ARRAY


    // static int max(int[] arr) {
    //     int maxval=arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //     if (arr[i]> maxval) {
    //         maxval = arr[i];
    //     }
    // }
    //     return maxval;


    // MAXRANGE


    static int maxrang(int[] arr, int start, int end) {
        int maxval=arr[0];
        for (int i = start; i <= end; i++) {
        if (arr[i]> maxval) {
            maxval = arr[i];
        }
    }
        return maxval;
}
}
