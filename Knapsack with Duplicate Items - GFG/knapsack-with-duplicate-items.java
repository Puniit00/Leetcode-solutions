//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[][] dp = new int[1001][1001];
    static int knapSack(int N, int W, int val[], int wt[])
    {
        for(int i=0;i<wt.length;i++){
            for(int j=0;j<=W;j++){
                dp[i][j] = -1;
            }
        }
        return sack(N, W, val, wt, 0);
    }
    
    private static int sack(int N, int W, int val[], int wt[], int index){
        if(index>= wt.length) return 0;
        if(wt[index]>W) return sack(N, W, val, wt, index+1);
        if(dp[index][W] != -1) return dp[index][W] =  dp[index][W];
        
        int a = val[index] + sack(N, W-wt[index], val, wt, index+1);
        int b = val[index] + sack(N, W-wt[index], val, wt, index);
        int c = sack(N, W, val, wt, index+1);
        
        return dp[index][W]= Math.max(a, Math.max(b,c));
    }
}