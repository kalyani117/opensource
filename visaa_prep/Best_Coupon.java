import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int off = price - (price/10);
        int discount = price - 100;
        if(off<=discount){
            System.out.println(off);
        }else{
            System.out.println(discount);
        }
        sc.close();
    
    }
}
