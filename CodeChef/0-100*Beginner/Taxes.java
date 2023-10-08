

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            {
                int a = input.nextInt();
                int b = input.nextInt();
                int invest = a - b;
                System.out.println(invest);
            }
        }
    }
}