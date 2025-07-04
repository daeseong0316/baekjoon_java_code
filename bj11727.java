import java.util.*;
import java.util.*;

public class bj11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        final int mod = 10007;
        
        dp[0] = 0;
        dp[1] = 1;
        if(n>=2) {
        	dp[2]=3;
        }
        
        for(int i=3;i<=n;i++) {
        	dp[i] = (dp[i-1] + dp[i-2] * 2) % mod;
        }
        
        System.out.println(dp[n]);
    }
}
