public class minimunNum {
    public static void main(String[] args) {
        int[] arr = {3,8,6,98,34,1};
        System.out.println(minimum(arr));

    }
    static int minimum(int[] arr){
        int min = arr[0];
        for(int i = 1;i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
