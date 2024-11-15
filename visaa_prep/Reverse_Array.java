import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = sc.nextInt();
        }
        for(int i=0 ; i<(n/2) ; i++){
            int t = ans[i];
            ans[i] = ans[n-i-1];
            ans[n-1-i] = t;
        }
        for(int  i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
}
