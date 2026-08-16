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
        String res = "";
        int low = 0;

        for (int high = 0; high < s.length(); high++) {
            c[ch[high]]++;

            while (high - low + 1 >= t.length()) {
                if (helper(tCount, c)) {
                    if (res.isEmpty() || (high - low + 1) < res.length()) {
                        res = s.substring(low, high + 1);
                    }
                    c[ch[low]]--;
                    low++; 
                } else {
                    break;
                }
            }
        }
        return res;
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