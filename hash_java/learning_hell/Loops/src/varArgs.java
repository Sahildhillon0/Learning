import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(5549,"Popeye", "Shan", "Jin");
        demo(34,34,35,7,5);
        demo("hello ", "World", "! ", "://");
    }

    //Variable arguments
    static void fun(int a, String ...s){
        System.out.println(Arrays.toString(s));

        System.out.println("Welcome Mr." + s[0] + ", " + s[1] + ", " + s[2] + "\nAccess code is " + a);
    }

//    Function overloading with variable arguments
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
