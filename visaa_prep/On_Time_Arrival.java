import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int tym = sc.nextInt();
            if(tym<30){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
