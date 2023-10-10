

import java.util.*;

public class practice_perfect {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] dayArr;
            int week = 0;
            for (int i = 0; i < 4; i++) {
                dayArr = new int[4];
                dayArr[i] = input.nextInt();

                if (dayArr[i] >= 10) {
                    week += 1;
                }
            }
            System.out.println(week);
        }
    }
}