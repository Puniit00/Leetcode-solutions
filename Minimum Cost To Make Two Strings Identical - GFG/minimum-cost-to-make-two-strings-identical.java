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
{ 
	public int findMinCost(String X, String Y, int costX, int costY)
	{
	    int[][] dp = new int[X.length()+1][Y.length()+1];
	    for(int i=1;i<=X.length(); i++){
	        for(int j=1;j<=Y.length();j++){
	             if(X.charAt(i-1) == Y.charAt(j-1)){
	                 dp[i][j] = 1+dp[i-1][j-1];
	             }
	             else{
	                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]); 
	             }
	        }
	    }
		int lcs = dp[X.length()][Y.length()];
		int cost1 = (X.length()- lcs)*costX;
		int cost2 = (Y.length()-lcs)*costY;
		
		return cost1+cost2;
	}
}
