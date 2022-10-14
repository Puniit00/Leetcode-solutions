//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		stack(s, s.size());
		return s;
	}
	
	private void stack(Stack<Integer> s, int i){
	    if(i == 1) return; 
	    
	    int top = s.pop();
	    stack(s, i-1);
	    Stack<Integer> dummy = new Stack<>();
	    while(!s.isEmpty() && s.peek() > top){
	        dummy.push(s.pop());
	    }
	    s.push(top);
	    while(!dummy.isEmpty()){
	        s.push(dummy.pop());
	    }
	    
	}
}