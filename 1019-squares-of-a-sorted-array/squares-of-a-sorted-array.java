class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1, idx = n-1;
        int[] arr = new int[n];
        while(l <= r) {
            int left = nums[l]*nums[l];
            int right = nums[r]*nums[r];
            if(left >= right) {
                arr[idx--] = left;
                l++;
            } else {
                arr[idx--] = right;
                r--;
            }
        }
        return arr;
    }
}