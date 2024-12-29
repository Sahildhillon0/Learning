import java.util.Scanner;

public class caseChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your word: ");
        char word = input.next().trim().charAt(0);

        if (word >= 'a' && word <= 'z' ) {
            System.out.println("First character is Lowercase");
        }else {
            System.out.println("First character is Uppercase");
        }
    }
}
