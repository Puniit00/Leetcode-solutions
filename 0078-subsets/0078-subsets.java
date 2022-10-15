class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(0,nums,list,res);
        return res;
    }
 
    public void helper(int index, int[] nums, List<Integer> list, List<List<Integer>> res){
        if(index >= nums.length)
            res.add(new ArrayList<>(list));
        else{
            list.add(nums[index]);
            helper(index+1, nums, list, res);
            list.remove(list.size()-1);
            helper(index+1, nums, list, res);
        }
    }
}
