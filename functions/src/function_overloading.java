import java.lang.reflect.Array;
import java.util.Arrays;

public class function_overloading {
    public static void main(String[] args) {
        fun(3);
        fun("akshata");
        demo(2, 4, 6);
        demo("akshata", "ajshdtefd");

    }
    //two functions with same name can exists with diff/erent parameters
    //it checks which function to use during compile time
    static void fun(int a){
        System.out.println(a);
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));

    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));

    }

    static void fun(String name){
        System.out.println(name);

    }
}
