import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isNegative = n < 0;
        int num = Math.abs(n);
        long reversed = 0; 
        while (num != 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit; 
            num /= 10; 
        }

        if (isNegative) {
            reversed = -reversed;
        }
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            System.out.println(0); 
        } else {
            System.out.println(reversed); 
        }
    }
}
