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
        int s = sc.nextInt();
        if (n == 0)
          return;
        s = s % n;
        if (s > n)
          return;
        int[] temp = new int[s];
        
        for(int i=(n-s);i<n;i++){
            temp[i-n+s]=arr[i];
           
        }
   
        for(int i=(n-s-1);i>=0;i--){
            arr[i+s] = arr[i];
        }
      
        for(int i=0;i<s;i++){
            arr[i]=temp[i];
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
