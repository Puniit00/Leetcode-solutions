//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int dp[][] = new int [1001][1001];
    public int longestPalinSubseq(String S)
    {
        for(int i=0;i<S.length();i++){
            for(int j=0;j<S.length();j++){
                dp[i][j] = -1;
            }
        }
        return rec(S, 0, S.length()-1);
    }
    
    private int rec(String s, int i, int j){
        if(i>j) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == s.charAt(j) && i!=j) return dp[i][j] = 2+rec(s,i+1, j-1);
        if(s.charAt(i) == s.charAt(j) && i==j) return dp[i][j] = 1+rec(s,i+1, j-1);
        int a = rec(s, i+1, j);
        int b = rec(s, i, j-1);
        
        return dp[i][j] = Math.max(a, b);
    }
}