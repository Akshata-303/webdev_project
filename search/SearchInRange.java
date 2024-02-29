public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={3,6,9,4,7,45,9,65,};
        int target = 9;
        System.out.println(linearSearch(arr,target,1,4));

    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i=start; i <= end; i++){
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        return -1;
    }
}
