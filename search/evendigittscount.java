public class evendigittscount {
    public static void main(String[] args) {
        int[] nums={12,345,7,8,9876,7654,3,678542};
        System.out.println(findNumbers(nums));
        System.out.println(digits(-74657));
        System.out.println(digits2(658694));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //check weather a number contains even digits or not
    static boolean even(int num){
        int numberOfdigits = digits(num);
        if(numberOfdigits % 2 == 0){
            return true;
        }
        return false;

    }

    static int digits2(int num){
        if(num < 0){
            num = -1*num;
        }
        return (int)(Math.log10(num)+1);
    }
    //check number of digits in a number
    static int digits(int num){

        if(num < 0){
            num = -1*num;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num>0){
            count++;
            num = num /10;
        }
        return count;


    }
}
