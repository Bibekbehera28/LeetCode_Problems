class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        for(int i = 0; i < n; i++) {
            int newindex = i+nums[i];
            if(newindex < 0) {
                newindex = (newindex%n+n)%n;
            } else {
                newindex = newindex%n;
            }
            result[i] = nums[newindex];
        }
        return result;
    }
}