package HackerRank;

import java.util.Scanner;

public class format {
    static String a ;
    static  int b;
    public static void main(String[] args) {

        Scanner robot = new Scanner(System.in);
        System.out.println("============================");

        for(int i  = 0; i < 3; i++){
            a = robot.next();
            b = robot.nextInt();
        }
        System.out.println("=============================");
        String fstr = String.format(" %1$s" , a);
        System.out.println(fstr);
    }
}
