import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int _1st = 0;
        int _2nd = 1;
        for (int i = 0; i < n+1; i++) {
            if (i ==0 || i ==1){
                System.out.println(i);
            }else {
                int _next = _1st +_2nd;
                System.out.println(_next);

                _1st = _2nd;
                _2nd = _next;

            }
        }
    }
}
