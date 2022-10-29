class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permutation(nums, list, 0);
        return list;
    }
    private void permutation(int[] nums, List<List<Integer>> res, int index){
        if(index == nums.length){
            List<Integer> list = new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++) list.add(nums[i]);
            res.add(list);
            return;
        }
        
        for(int i=index;i<nums.length;i++){
            swap(i, index, nums );
            permutation(nums, res, index+1);
            swap(i, index, nums);
        }
    }
    
    private void swap(int i, int j, int[] nums){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}