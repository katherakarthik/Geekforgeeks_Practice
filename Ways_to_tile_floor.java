class Solution {
    static int numberOfWays(int n) {
        // code here
        if(n<0){
            return 0;
        }
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        if(n>=2){
            dp[2]=2;
        }
        
        for(int i=3;i<=n;i++){
            
        
        dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    // return dp[n];
    
};
