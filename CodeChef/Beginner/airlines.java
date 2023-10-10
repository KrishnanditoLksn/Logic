

import java.util.Scanner;

public class airlines {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                int eachAirplaneCapacity = 10 * input.nextInt();
                int nPlanePeople = input.nextInt();
                
                int max = Math.min(eachAirplaneCapacity, nPlanePeople);

                int seatCose = max * input.nextInt();
                System.out.println(seatCose);
                
            }
        }
    }
}
