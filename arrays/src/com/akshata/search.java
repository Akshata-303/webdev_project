package com.akshata;

public class search {
    public static void main(String[] args) {
        int[] nums = {1,45,67,43,21,67};
        int target = 74;
        int ans = linearsearch(nums,target);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //when target is not hit
        return -1;
    }
}
