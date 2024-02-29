public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-3,-2,-1,0,4,7,9,54,65,76,87,98};// ascending
        int[] arr = {90,87,76,54,43,32,21,9,8,7};//descending
        int target = 76;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);

    }
    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find weather array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];


        while(start <= end){
            //if (start+end) value of out of range in java
            int mid = start + (end - start) / 2;
            //System.out.println(mid);

            if(arr[mid] == target) {
                return mid;
            }

            if (isAsc){
                if(target < arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }



        }
        return -1;

    }
}
