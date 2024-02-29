public class BinaySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,12,34,54};
        int target = 4;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        for(int j = 0;j<){
            int middle = (arr.length-1) / 2;
            //System.out.println(arr.length);
            if (target > arr[middle]){
                int start = middle + 1;
                int end = arr.length - 1;
                for(int i = start; i <= end;i++){
                    if(arr[i] == target){
                        return i;
                    }
                }
                return -1;
            }
            else if (target < arr[middle]) {
                int start = 0;
                int end = middle -1;
                for(int i = start;i<= end;i++){
                    if(target == arr[i]) {
                        return i;
                    }
                }
                return -1;

            }
            return middle;

        }

    }
}
