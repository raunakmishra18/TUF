public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,11,22,33,44};
        int target=50;
        int ans=SearchElement(arr, target);
        System.out.println(ans);
    }

    // Linear Search in Array

    // static int Search(int[]arr,int target){
    //     if(arr.length==0){
    //         return -1;
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         int element=arr[i];
    //         if(element==target){
    //             return i;
    //         }
    //     }
    //     return -1;

    static int SearchElement(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            int element=arr[i];
            if (element==target){
                return element;
            }
        }
        return -1;
    }
    }

