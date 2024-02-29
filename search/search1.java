public class search1 {
    public static void main(String[] args) {
        int[] nums = {36,68,9,634,56,98,34,65,77};
        int target = 985;
        int ans = linerSearch(nums, target);
        System.out.println(ans);

    }

    static int linerSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;


    }

    static int linerSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;


    }
    //return true or false

    static boolean linerSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        return false;


    }
}
