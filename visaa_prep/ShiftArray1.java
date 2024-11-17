import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int s = 1;
        int[] temp = new int[s];
        for(int i=0;i<s;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<(n-s);i++){
            arr[i] = arr[i+s];
        }
        int d = 0;
        for(int i=(n-s);i<n;i++){
            arr[i]=temp[d];
            d++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
