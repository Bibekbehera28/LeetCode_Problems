class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int c[] = new int[26];
        char a[] = s.toCharArray();
        int low = 0;
        int res = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int high = 0; high < n; high++) {
            c[a[high] - 'A']++;
            max = Math.max(max,c[a[high] - 'A']);
            if((high - low + 1) - max > k) {
                c[a[low] - 65]--;
                low++;
            }
            res = Math.max(res,high - low + 1);
        }
        return res;
    }
}

// check first code for better understanding;