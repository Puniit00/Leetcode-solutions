class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++) sum+=nums[i];
        
        int ans = IfWin(nums, 0, nums.length-1);
        
        if(ans >= sum-ans) return true;
        return false;
    }
    private int IfWin(int[]nums, int s, int e){
        if(s>e) return 0;
        int choice1 = nums[s] + Math.min(IfWin(nums,s+2,e), IfWin(nums, s+1,e-1));
        int choice2 = nums[e] + Math.min(IfWin(nums,s+1,e-1), IfWin(nums,s,e-2));
        return Math.max(choice1,choice2);
        }
    }
