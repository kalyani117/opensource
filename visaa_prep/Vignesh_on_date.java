import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int chef = sc.nextInt();
        int waiter = sc.nextInt();
        if(chef > waiter){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}
