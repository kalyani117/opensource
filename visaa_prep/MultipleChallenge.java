import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long count = (N / 3) + (N / 5) - (N / 15);

        
        System.out.println(count);
    }
}
