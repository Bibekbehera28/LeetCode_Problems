class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int max_diff = Integer.MAX_VALUE;
        int resSum = 0;
        for(int i = 0; i < n - 2; i++) {
            int left = i+1;
            int right = n-1;
            while(left < right) {
                int sum = nums[i]+nums[left]+nums[right];
                int diff = Math.abs(target - sum);
                if(diff < max_diff) {
                    max_diff = diff;
                    resSum = sum;
                }
                if(sum == target) {
                    left++;
                    right--;
                } else if(sum < target) {
                    left++; 
                } else {
                    right--;
                }
            }
        }
        return resSum;
    }
}