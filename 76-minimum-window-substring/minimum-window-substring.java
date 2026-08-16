class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        if (s.equals(t)) return t;

        int tCount[] = new int[128];
        for (char ch : t.toCharArray()) {
            tCount[ch]++;
        }

        int c[] = new int[128];
        char ch[] = s.toCharArray();
        int res = Integer.MAX_VALUE,start = 0;
        int low = 0;

        for (int high = 0; high < s.length(); high++) {
            c[ch[high]]++;

            while (helper(tCount, c)) {
                int len = high - low + 1;
                if (len < res) {
                    res = len;
                    start = low;
                }
                c[ch[low]]--;
                low++; 
            }
        }
        return res == Integer.MAX_VALUE ? "" : s.substring(start,start+res);
    }

    public static boolean helper(int[] tCount, int[] c) {
        for (int i = 0; i < 128; i++) {
            if (c[i] < tCount[i]) {
                return false;
            }
        }
        return true;
    }
}