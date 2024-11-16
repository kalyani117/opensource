import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int airlines = sc.nextInt();
        int passen = sc.nextInt();
        int n = 0;
        int rem = passen - (airlines*100);
        if(rem<=0){
            System.out.print(n);
        }else{
            n = rem/100;
            rem = rem%100;
            if(rem!=0){
                n++;
            }
            System.out.print(n);
        }
        
    }
}
