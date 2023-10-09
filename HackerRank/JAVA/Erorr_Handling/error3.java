package Erorr_Handling;

public class error3 {
    public static void main(String[] args) {
        try {
            int [] a = new int [5];
            a[5] = 30/0;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("common task completed");
        }
    }
}
