class Solution {
   public char findKthBit(int n, int k) {
        if(n == 1){
            return '0';
        }
        
        int numberOfColumns = (int)Math.pow(2,n) - 1;
        int mid = numberOfColumns/2;
                
        if(k <= mid){
            return findKthBit(n-1,k);
        } else if (k == mid + 1){ 
            return '1';
        } else {
           k = numberOfColumns - k + 1;
           char c = findKthBit(n-1,k);
           return c == '0' ? '1' : '0';
        }
}
}