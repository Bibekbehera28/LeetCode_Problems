class Solution {
    public int minMoves(int[] nums) {
        int c = 0;
        int max = Integer.MIN_VALUE;
        for(int i : nums) {
            max = Math.max(max,i);
        }
        for(int i = 0; i < nums.length; i++) {
            c += max - nums[i];
        }
        return c;
    }
}