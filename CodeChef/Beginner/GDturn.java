

import java.util.Scanner;

public class GDturn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = 0;
        int number = 0;

        for (int i = 0; i < n; i++) {
            c = input.nextInt();
            number = input.nextInt();

            if (c + number <= 6) {
                System.out.println("NO");
            } else if (c + number > 6) {
                System.out.println("YES");
            }

        }
    }
}