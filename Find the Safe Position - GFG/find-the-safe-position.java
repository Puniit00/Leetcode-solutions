//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int k = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.safePos(n,k));
        }
    }
}
// } Driver Code Ends


class Solution {
     static int safePos(int n, int k) {

        // code here

        

        ArrayList<Integer> al=new ArrayList<>();

        for(int i=1; i<=n; i++)

        {

            al.add(i);

        }

        int ans= findsafepos(al,k,0);

        

        return ans;

    }

    public static int findsafepos(ArrayList<Integer> al,int k,int ind)

    {

        if(al.size()==1)

        {

            return al.get(0);

        }

        

        int index=(ind+(k-1))%al.size();

        

        al.remove(index);

        

        return findsafepos(al,k,index);

 

    }
};