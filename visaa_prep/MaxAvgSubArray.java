import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int as = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[as];
        for(int i=0;i<as;i++){
            arr[i]=sc.nextInt();
        }
        int l=0;
        int r=k-1;
        if(k>as){
            System.out.print("0.0");
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
            sum += arr[i];
        }
        max = Math.max(max,sum);
        while(r<(as-1)){
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            max = Math.max(max,sum);
        }
        double res = (double)max/k;
        System.out.print(String.format("%.4f",res));
    }
}
