import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        if(a+b+c <= x){
            System.out.print("NO");
        }
        else if(a+b >= x){
            System.out.println("YES");
        }else if(b+c >= x){
            System.out.println("YES");
        }else if(c+a >=x){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
