import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int f = sc.nextInt();
            String s = (f>=65 && f<=45000)?"YES":"NO";
            System.out.println(s);
        }
    }
}
