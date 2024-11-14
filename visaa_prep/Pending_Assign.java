import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int assg = sc.nextInt();
        int min = sc.nextInt();
        int days = sc.nextInt();
        int t1 = assg*min;
        int t2 = days*24*60;
        if(t1<=t2){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
