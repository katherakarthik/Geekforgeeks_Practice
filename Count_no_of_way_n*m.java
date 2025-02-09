class Solution
{
    public int countWays(int n, int m)
    {
        // Code here
        int mod=1000000007;
        int dp[]=new int[n+1];
        dp[0]=1;
        
        for(int i=1;i<=n;i++){
            if(i<m){
                dp[i]=dp[i-1];
            }
            else if(i==m){
                dp[i]=(dp[i-1]+1)%mod;
            }
            else{
                dp[i]=(dp[i-1]+dp[i-m])%mod;
            }
            
        }
        return dp[n];
    }
}
