import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class twod_array {
    public static void main(String[] args) {
        //int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);//no of rows
        //input

        for (int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        //for (int i = 0;i < arr.length; i++){
          //  for(int j = 0;j < arr[i].length; j++){

              //  System.out.print(arr[i][j] + " ");

          //  }
           // System.out.println();
       //}

        //for (int i = 0;i < arr.length; i++){
           // System.out.println(Arrays.toString(arr[i]));
        //}

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

        //int[] arr = {1,23,5};
        //System.out.println(Arrays.toString(arr));
        //change(arr);
        //System.out.println(Arrays.toString(arr));
    }
    //static void change(int[] num){
        //num[0] = 2;
    //}
}
