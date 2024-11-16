import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=3 && n<=5){
            System.out.println("Spring");
        }else if(n>=6 && n<=8){
            System.out.print("Summer");
        }else if(n>=9 && n<=11){
            System.out.print("Autumn");
        }else if(n==12 || n==1 || n==2){
            System.out.print("Winter");
        }else{
            System.out.print("Invalid");
        }
    }
}
