//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String S){
        ArrayList<String> list = new ArrayList<>();
        
        spaces(list, S, "", 0);
        return list;
    }
    
    private void spaces(ArrayList<String> list, String s, String res, int index){
        if(index == s.length()){
            if(!list.contains(res) && res.charAt(res.length()-1)!=' '){
                list.add(res);
            }
            return;
        }
        
        spaces(list, s, res+s.charAt(index)+" ", index+1);
        spaces(list, s, res+s.charAt(index), index+1);
        return;
    }
    
}