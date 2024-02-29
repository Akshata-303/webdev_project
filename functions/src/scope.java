public class scope {
    public static void main(String[] args) {
         int a = 4;
         int b = 45;
        {
            int e =   68;
            //values initialised in this block, will reamin in block
        }
    }
    static void random(){
        int c = 23;
        int d = 46;
        System.out.println(c);
    }
}
