class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            arr[i] += sum;
        }
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                rightSum = arr[n-1]-arr[i];
                if(rightSum == leftSum) return i;
            } else {
                rightSum = arr[n-1]-arr[i];
                leftSum = arr[i-1];
                if(rightSum == leftSum) return i;
            }  
        }
        return -1;
    }
}