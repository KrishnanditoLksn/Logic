
import java.util.Scanner;

public class AddFlow01 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                int a = input.nextInt();
                int b = input.nextInt();

                int sum = a + b;
                System.out.println(sum);
            }
        }
    }
}