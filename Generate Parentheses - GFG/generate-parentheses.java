//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        List<String> res = new ArrayList<String>();
        
        generate(n, "", 0, 0, res);
        
        return res;
    }
    
    public void generate(int n, String str, int open, int close, List<String> ans){
        if(str.length()==2*n){
            if(open == close){
            ans.add(str);}
            return;
        }
        
    
            generate(n, str+"(", open+1, close, ans);
        if( open > close)
            generate(n, str+")", open, close+1, ans);
    }
}