import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int k;
        if(n%2 == 0 ){
            k = n/2 - 1;
        }else{
            k = n/2;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=k;j++){
                int t = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = t;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
