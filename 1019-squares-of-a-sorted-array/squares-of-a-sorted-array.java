class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i : nums) {
            if(i < 0) {
                neg.add(i);
            } else {
                pos.add(i);
            }
        }

        if(pos.size() == 0) {
            for(int i = 0; i < neg.size(); i++) {
                neg.set(i, neg.get(i) * neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        if(neg.size() == 0) {
            for(int i = 0; i < pos.size(); i++) {
                pos.set(i, pos.get(i) * pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        for(int i = 0; i < neg.size(); i++) {
                neg.set(i, neg.get(i) * neg.get(i));
        }
        Collections.reverse(neg);

        for(int i = 0; i < pos.size(); i++) {
                pos.set(i, pos.get(i) * pos.get(i));
        }

        int idx = 0;
        int i = 0, j = 0;
        int n1 = pos.size();
        int n2 = neg.size();
        int[] arr = new int[n1+n2];
        while(i < n1 && j < n2) {
            if(pos.get(i) <= neg.get(j)) {
                arr[idx++] = pos.get(i++);
            } else {
                arr[idx++] = neg.get(j++);
            }
        }

        while(i < pos.size()) {
            arr[idx++] = pos.get(i++);
        }
        while(j < neg.size()) {
            arr[idx++] = neg.get(j++);
        }

        return arr;
    }
}