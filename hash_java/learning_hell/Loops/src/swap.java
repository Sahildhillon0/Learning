import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int _1st = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int _2nd = input.nextInt();
        String swapped = swapNum(_1st,_2nd);
        System.out.println(swapped);
    }

    static String swapNum(int a , int b){
        a = a+b;
        b=a-b;
        a=a-b;

        return "the swapped numbers are " + a + " and " + b;
    }
}
