import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int gym = sc.nextInt();
        int trainer = sc.nextInt();
        int budget = sc.nextInt();
        if(gym+trainer <= budget){
            System.out.print("2");
        }else if(gym <= budget){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}
