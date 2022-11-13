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
                    String X = sc.next();
                    String Y = sc.next();
                    int costX = sc.nextInt();
                    int costY = sc.nextInt();
                    
                   
                    Solution ob = new Solution();
                    System.out.println(ob.findMinCost(X,Y,costX,costY));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{   int[][] dp = new int[1001][1001];
	public int findMinCost(String X, String Y, int costX, int costY)
	{
	    for(int i=0;i<X.length(); i++){
	        for(int j=0;j<Y.length();j++){
	            dp[i][j] = -1;
	        }
	    }
		int lcs = lcs(X, Y, 0, 0);
		int cost1 = (X.length()- lcs)*costX;
		int cost2 = (Y.length()-lcs)*costY;
		
		return cost1+cost2;
	}
	
	private int lcs(String x, String y, int i, int j){
	    if(i==x.length() || j == y.length()) return 0;
	    
	    if(dp[i][j] != -1) return dp[i][j];
	    if(x.charAt(i) == y.charAt(j)) return dp[i][j] = 1+lcs(x, y, i+1, j+1);
	    
	    return dp[i][j] = Math.max(lcs(x, y, i+1, j), lcs(x, y, i, j+1));
	}
}
