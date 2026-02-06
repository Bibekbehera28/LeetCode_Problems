class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            li.add(nums[i]);
        }
        for(int i = min; i < max; i++) {
            if(!li.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}