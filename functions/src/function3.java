import java.util.Arrays;

public class function3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void change(int[] nums) {
       nums[0] = 99; //if you make chage to this object via ref variable, same object will be changed
    }
}
