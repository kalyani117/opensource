import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            int t = sc.nextInt();
            if((m-t)<0){
                System.out.println("0");
            }else{
                System.out.println((m-t));
            }
        }
    }
}
