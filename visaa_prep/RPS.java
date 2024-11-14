import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char ch1  = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        if(ch1 == ch2){
            System.out.print("NULL");
        }else {
        switch(ch1){
            case 'R':
                if(ch2=='P') System.out.print("Charan");
                else System.out.print("Vignesh");
                break;
            case 'S':
                if(ch2=='R') System.out.print("Charan");
                else System.out.print("Vignesh");
                break;
            case 'P':
                if(ch2=='S') System.out.print("Charan");
                else System.out.print("Vignesh");
                break;
            default :
                System.out.print("NULL");
                break;
        }
        }
    }
}
