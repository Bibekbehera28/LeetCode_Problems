class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        char[] a = s.toCharArray();
        int low = 0;
        int maxFreq = 0;
        int res = 0;
        for (int high = 0; high < s.length(); high++) {
            count[a[high] - 'A']++;
            maxFreq = Math.max(maxFreq, count[a[high] - 'A']);
            if ((high - low + 1) - maxFreq > k) {
                count[a[low] - 'A']--;
                low++;
            }
            res = Math.max(res, high - low + 1);
        }
        return res;
    }
}