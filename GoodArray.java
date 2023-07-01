import java.io.*;
import java.util.*;

public class Solution {
    public static boolean duplicate(int z, int arr[]){
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i<z; i++){
            if(h.contains(arr[i])){
                return false;
            }else{
                h.add(arr[i]);
            }
        }
        return true;
    }
    public static boolean ascending(int z, int arr[]){
        int a = arr[0];
        for(int i = 1; i<z; i++){
            if(arr[i]<a);{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int arr[] = new int[z];
        for(int i =0; i<z;i++){
            arr[i] = sc.nextInt();
        }
        if(arr.length==z){
               if(duplicate(z, arr)){
                   if(ascending(z,arr)){
                       System.out.println("Good");
                   }else{
                        System.out.println("Not Good");
                   }
                   }else{
            System.out.println("Not Good");
        }
        }else{
            System.out.println("Not Good");
        }
    }
}
