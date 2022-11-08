//{ Driver Code Starts
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
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            

            Solution ob = new Solution();
            if(ob.is1winner(N,arr))
            System.out.println("1");
            else
            System.out.println("0");
            
        }
    }
}

// } Driver Code Ends


class Solution{
    static int[][] memo = new int[10001][10001];
    static Boolean is1winner(int N, int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                memo[i][j] = -1;
            }
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int ans = win(N, arr, 0, arr.length-1, 0);
        if(ans > sum-ans) return true;
        return false;
    }
    
    private static int win(int N, int[] arr, int i, int j, int sum){
        if(i>j) return 0;
        
        if(memo[i][j] != -1) return memo[i][j];
        
        int score1 = arr[i] + Math.min(win(N, arr, i+2, j, sum),win(N, arr, i+1, j-1, sum) );
        int score2 = arr[j] + Math.min(win(N, arr, i+1, j-1, sum), win(N, arr, i, j-2, sum));
        
        return memo[i][j] = Math.max(score1, score2);
    }
}