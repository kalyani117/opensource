import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long x = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
           
        }
        for(int i=0;i<n;i++){
            x = x^arr[i];
        }
        System.out.print(x);
    }
}
