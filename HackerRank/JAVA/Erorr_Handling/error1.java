package Erorr_Handling;

import java.util.*;

public class error1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            try {
                int number = input.nextInt();
                int number2 = input.nextInt();

                String num = String.valueOf(number);
                String num2 = String.valueOf(number2);

                System.out.println(num);
                System.out.println(num2);
            } catch (InputMismatchException e) {
                System.out.println("Harus angka ");
            }

        }
    }
}
