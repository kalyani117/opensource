import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int l =0;
        int r = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=0;j<i;j++){
                l+=arr[j];
            }
            for(int j=n-1 ; j>i ; j--){
                r+=arr[j];
            }
            System.out.print(Math.abs(l-r)+" ");
            l=0;
            r=0;
        }
    }
}
