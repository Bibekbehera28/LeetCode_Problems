class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++) {
            map.put(nums[i],1);
        }
        for(int i = 1; i <= nums.length-k; i++) {
            for(int j = i; j < i+k; j++) {
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
        }
        for(int i : map.keySet()) {
            if(map.get(i) == 1) max = Math.max(max,i);
        }
        return max == Integer.MIN_VALUE ? -1 : max;
    }
}