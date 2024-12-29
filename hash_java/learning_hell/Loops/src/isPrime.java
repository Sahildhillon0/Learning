import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num = input.nextInt();
        System.out.println(isprime(num));
    }

    static Boolean isprime(int num) {
        int count = 2;
        while (count <num){
            if(num%count==0){
                return false;
            }
            count++;
        }
        return true;
    }
}
