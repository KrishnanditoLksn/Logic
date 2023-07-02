package HackerRank;

import java.util.Scanner;

public class stdout {
    public static void main(String[] args) {
        Scanner robot = new Scanner(System.in);
        int a = robot.nextInt();
        double b = robot.nextDouble();
        String c = robot.next();
        c += robot.nextLine();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
