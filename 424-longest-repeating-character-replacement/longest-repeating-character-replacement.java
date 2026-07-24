class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int c[] = new int[26];
        char a[] = s.toCharArray();
        int low = 0;
        int res = Integer.MIN_VALUE;
        for(int high = 0; high < n; high++) {
            c[a[high] - 65]++;
            int len = high - low + 1;
            int max = findMax(c);
            int diff = len - max;
            while(diff > k) {
                c[a[low] - 65]--;
                low++;
                len = high - low + 1;
                max = findMax(c);
                diff = len - max;
            }
            res = Math.max(res,high - low + 1);
        }
        return res;
    }

    public static int findMax(int[] c) {
        int max = Integer.MIN_VALUE;
        for(int i : c) {
            max = Math.max(max,i);
        }
        return max;
    }
}