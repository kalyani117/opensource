import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        for(int i=0 ; i<n ; i++){
            int totalp = sc.nextInt();
            int passp = sc.nextInt();
            
            System.out.println((totalp/10)*passp);
            
        }
        
        sc.close();
    }
}
