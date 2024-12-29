import java.util.ArrayList;
import java.util.Scanner;

public class maximun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(input.nextInt());
        }

        int max = arr.getFirst();

        for (int j = 0; j < arr.toArray().length; j++) {
            if (max < arr.get(j)){
                max = arr.get(j);
            }
        }
        System.out.println(arr);
        System.out.println("maximum number is " + max);
    }
}
