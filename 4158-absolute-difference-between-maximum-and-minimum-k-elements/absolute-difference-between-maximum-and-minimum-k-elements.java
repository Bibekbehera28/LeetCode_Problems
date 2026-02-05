class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = 0;
        int max = 0;
        int i = 0,j = nums.length-1;
        while(k > 0) {
            min += nums[i];
            max += nums[j];
            i++;
            j--;
            k--;
        }
        return Math.abs(max-min);
    }
}