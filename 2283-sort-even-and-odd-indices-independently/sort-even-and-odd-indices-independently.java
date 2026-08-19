class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(i%2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        even.sort((a,b) -> Integer.compare(a,b));
        odd.sort((a,b) -> Integer.compare(b,a));

        int eidx = 0, oidx = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i%2 == 0) {
                nums[i] = even.get(eidx++);
            } else {
                nums[i] = odd.get(oidx++);
            }
        }
        return nums;
    }
}