public class search1 {
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,4,7,9,54,76,98};
        int target = 54;
        int ans = BinaySearch(arr, target);
        System.out.println(ans);
    }

    static int BinaySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //if (start+end) value of out of range in java
            int mid = start + (end - start) / 2;
            System.out.println(mid);

            if(target < arr[mid]) {
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;

            }

        }
        return -1;

    }
}
