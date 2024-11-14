import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int prob = sc.nextInt();
        int emark = sc.nextInt();
        int tmark = sc.nextInt();
        if(tmark%emark == 0 && tmark<=(emark*prob)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
