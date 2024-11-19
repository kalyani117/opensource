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
        Arrays.sort(arr);
        int max= 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[k]<arr[i]+arr[j]){
                        max = Math.max(arr[i]+arr[j]+arr[k],max);
                    }
                }
            }
        }
        if(max==0){
            System.out.print("-1");
        }else{
            System.out.print(max);
        }
    }
}
