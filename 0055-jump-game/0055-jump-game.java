class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        int remLength = nums.length-1;
        if(nums.length==1)return true;
        for(int i=1;i<nums.length;i++){
            if(max<=0){
                return false;
            }
            remLength--;
            max--;
            if(nums[i] > max){
                max = nums[i];
            }
            
            if(max>= remLength) return true;
            
        }
        return false;
    }
}