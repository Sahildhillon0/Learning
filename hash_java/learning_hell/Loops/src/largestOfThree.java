import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = input.nextInt();

        if (a > b && a > c){
            System.out.println(a + " is the Largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is the Largest");
        }else {
            System.out.println(c + " is the Largest");
        }

    }
}
