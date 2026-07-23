class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s == null || s.isEmpty()) return 0;
        char a[] = s.toCharArray();
        int n = s.length();
        int low = 0;
        int res = 0;
        for(int high = 0; high < n; high++) {
            map.put(a[high],map.getOrDefault(a[high],0)+1);
            int k = high - low + 1;
            while(map.size() < k) {
                map.put(a[low],map.get(a[low])-1);
                if(map.get(a[low]) == 0) map.remove(a[low]);
                low++;
                k = high - low + 1;
            }
            res = Math.max(res,high-low+1);
        }
        return res;
    }
}