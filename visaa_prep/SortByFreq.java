import java.io.*;
import java.util.*;
class Pair{
    int f;
    int s;
    Pair(int f,int s){
        this.f=f;
        this.s=s;
    }
    Pair(){
        
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Pair> ls = new ArrayList<>();
        for(int k:mp.keySet()){
            ls.add(new Pair(k,mp.get(k)));
        }
        Collections.sort(ls,(a,b)->{
            if(a.s==b.s)
            return a.f-b.f;
            else
            return a.s-b.s;
        });
        for(int i=0;i<ls.size();i++){
            while(ls.get(i).s >0){
                System.out.print(ls.get(i).f + " ");
                ls.get(i).s--;
            }
        }
    }
}
