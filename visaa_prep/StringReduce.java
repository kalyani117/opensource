import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c = 0;
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i<str.length()){
            c = 1;
            char ch = str.charAt(i);
            while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)){
                c++;
                i++;
            }
            ans.append(ch).append(c);
            i++;
        }
        System.out.print(ans);
    }
}
