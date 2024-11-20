import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int num = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l = 0;
        int r = n-1;
        int mid = 0;
        while(l<=r){
            mid = (l+r)/2;
            if(arr[mid]==num){
                System.out.print(mid);
                return;
            }else if(arr[mid]<num){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        System.out.print(l);
        
    }
}
