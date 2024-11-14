import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int mango = sc.nextInt();
        int truck = sc.nextInt();
        int bridge = sc.nextInt();
        bridge = bridge-truck ;
        int n = bridge/mango ;
        System.out.println(n);
    }
}
