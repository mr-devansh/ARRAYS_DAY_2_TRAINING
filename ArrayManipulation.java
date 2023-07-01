import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;


public class Solution {

    public static void main(String[] args) throws Exception {
        long n,m,a,b,k,i,j,max=0,sum=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        m = sc.nextLong();
        long arr[] = new long[(int)(n+1)];
        for(i=0;i<m;i++){
            a = sc.nextLong();
            b = sc.nextLong();
            k = sc.nextLong();
            arr[(int) a]+=k;
            if(((int)(b+1))<=n)
                arr[(int)(b+1)]-=k;
        }
        for(i = 1;i<=n;i++){
            sum+=arr[(int) i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
