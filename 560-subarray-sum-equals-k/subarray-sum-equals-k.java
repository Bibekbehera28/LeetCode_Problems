class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int n = nums.length;
        int psum = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            psum += nums[i];
            if(map.containsKey(psum-k)) {
                count += map.get(psum-k);
            }
            map.put(psum,map.getOrDefault(psum,0)+1);
        }
        return count;
    }
}