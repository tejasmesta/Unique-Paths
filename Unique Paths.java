class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int row = 0; row < m; row++)
        {
            for (int col = 0; col < n; col++)
            {
                dp[row][col] = -1; 
            }
        }
        
        return ddp(0,0,m,n,dp);
    }
    
    public int ddp(int i, int j,int m,int n , int dp[][])
    {
        if(i==m-1 && j==n-1)
        {
            return 1;
        }
        if(i>=m || j>=n)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        else
        {
            return dp[i][j] = ddp(i+1,j,m,n,dp) + ddp(i,j+1,m,n,dp);
        }
    }
}
