import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0 ; i<m ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<m;i++){
            if(arr[i]%n == 0){
                sum += arr[i];
            }else{
                sum -= arr[i];
            }
        }
        System.out.print(sum);
    }
}
