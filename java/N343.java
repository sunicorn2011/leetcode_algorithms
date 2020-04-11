import java.util.*;

public class N343 {
    public int integerBreak(int n) {
        int [] dp = new int[n + 1];
        dp[1] = 1;
        for(int i=2;i<n+1;i++){
            for(int j=i-1;j>0;j--){
                dp[i] = Math.max(Math.max(dp[i], j * dp[i - j]), (i - j) * j);
            }
        }
        return dp[n];
    }
}
