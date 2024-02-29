import java.util.Arrays;

public class SerchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,6},
                {76,75,98,32},
                {43,67,32},
                {5,87,100}
        };
        int target = 100;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
