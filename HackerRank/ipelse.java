package HackerRank;

import java.util.Scanner;

public class ipelse {
    public static void main(String[] args) {
        Scanner robot= new Scanner(System.in);
        int n = robot.nextInt();

        if (n % 2 ==1){
            System.out.println("Weird");
        }
        else if(n % 2 == 0 && n >=2 &&  n<=5){
            System.out.println("Not Weird");
        }else if( n >=6 && n <=20 ){
            System.out.println("Weird");
        }
        else if (n % 2 == 0 && n > 20){
            System.out.println("Not Weird");
        }
    }
}
