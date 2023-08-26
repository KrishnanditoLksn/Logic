package LeetCoding;

public class palindrome {
    public static  boolean isPalindrome(int s){
       if (s < 0){
           return  false;
       }
     /*  if (temp !=0) {
           for (int i = temp; i >= temp; i--) {
               int digit = temp % 10;
               reverse = reverse * 10 + digit;
               temp /= 10;
           }

       }*/
        int reverse = 0;
           int temp = s;
           do {
               int digit= temp % 10;
               reverse = reverse * 10 + digit;
               temp /= 10;
           }
           while (temp !=0);
       return reverse == s;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
