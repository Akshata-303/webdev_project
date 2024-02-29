public class Celing {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,13,34,67};
        int target = 33;
        int ans = CeilingBS(arr, target);
        System.out.println(ans);

    }

    static int CeilingBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;

            }else {
                start = mid + 1;
            }
        }
        return end;


    }
}
