import java.util.Arrays;

public class sorting1 {
    public static void main(String[] args) {
        int[] arr = {3,1,6,4,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));


        //sinking sort or exchanging sort

    }
    //space complexity = 0(1) which is constant // no extra space required
    //best case = sorted//n comparisions
    //wost case = arr in descending order //n square comparisions
    static void sort(int[] arr){
        boolean swapped;
        for(int i = 0;i<arr.length-1;i++){
            swapped = false;
            for(int j = 1;j<=arr.length-i-1;j++){
                if (arr[j] < arr[j-1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;

                }
            }
            // if you not swap for particular value of i, it means array is sorted hence stop the program
            if (!swapped) {
                break;
            }
        }
    }
}
