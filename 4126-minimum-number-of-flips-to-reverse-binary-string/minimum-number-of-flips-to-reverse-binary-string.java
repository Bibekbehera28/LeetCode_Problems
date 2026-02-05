class Solution {
    public int minimumFlips(int n) {
        String bit = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(bit);
        String reverse = sb.reverse().toString();
        int xor = 0;
        for(int i = 0; i < sb.length(); i++) {
            xor += (bit.charAt(i) - '0') ^ (reverse.charAt(i) - '0');
        } 
        return xor;
    }
}