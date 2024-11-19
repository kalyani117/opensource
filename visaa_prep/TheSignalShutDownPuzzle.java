import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<n;k++){
                        if(arr[i][k]==1){
                            arr[i][k]=2;
                        }
                        
                    }
                    for(int k=0;k<m;k++){
                        if(arr[k][j]==1){
                            arr[k][j]=2;
                        }
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==2){
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
