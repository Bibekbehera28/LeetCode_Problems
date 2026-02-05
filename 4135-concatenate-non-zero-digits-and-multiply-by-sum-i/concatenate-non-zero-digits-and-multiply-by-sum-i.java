class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(n > 0) {
            int digit = n%10;
            if(digit != 0) {
                sum+=digit;
                sb.append(digit);
            }
            n/=10;
        }
        String s = sb.reverse().toString();
        long product;
        if(s!=null && !s.isEmpty()) {
            product = Long.parseLong(s);
        } else {
            product = 0;
        }
        return product*sum;
        
    }
}