class Solution {
    public int mirrorDistance(int n) {
        int n1 = 0;
        int temp = n;
        while(n > 0) {
            int digit = n%10;
            n1 = n1*10+digit;
            n = n/10;
        }
        return Math.abs(temp-n1);
    }
}