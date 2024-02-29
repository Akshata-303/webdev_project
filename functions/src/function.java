import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        int ans = sum3(2,4);
        System.out.println("sum: " + ans);
    }

    //pass the value of numbers when your are calling the method in main()
    static int sum3(int a,int b){
        int sum = a+b;
        return sum;
    }
    //return the value
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }

}
