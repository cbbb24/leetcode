class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        for(int i = 1; i < citations.length + 1; i++){
            if(citations[citations.length - i] >= i)
                h = i;
        }
        return h;
    }
}
