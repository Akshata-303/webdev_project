import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        amstrong(n);
    }
    static void amstrong(int n) {
        int temp = n;
        int ans = 0;
        while (n > 0) {

            int rem = n % 10;
            ans = ans + (rem * rem * rem);
            n = n / 10;
        }
        if(temp == ans){
            System.out.println("the given number is amstrong");
        }
        else{
            System.out.println("the given not number is amstrong");
        }
    }


}
