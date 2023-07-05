class Solution {
    public int climbStairs(int n) {
        if (n == 0||n ==1)
        {
            return 1;
        }
         return climbStairs(n-1) + climbStairs(n-2);
    }
}


// another method
class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}