public class shadowing {
    static int x = 57;//available to everything within this block
    public static void main(String[] args) {
        System.out.println(x);//57,this will be shadowed at line 6
        int x = 58;
        System.out.println(x);//58
        fun();//57

    }
    static void fun(){
        System.out.println(x);
    }
}
