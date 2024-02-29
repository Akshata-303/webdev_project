import java.util.Scanner;

public class function1 {
    public static void main(String[] args) {
        String c = greet(" Akshata");
        System.out.println(c);

    }

    private static String greet(String name) {
        String d = "hello" + name;
        return d;
    }

    static String greeting(){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        return a;

    }
}
