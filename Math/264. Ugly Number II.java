class Solution {
    public int nthUglyNumber(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        int[] result = new int[n];
        int index2 = 0, index3 = 0, index5 = 0;
        result[0] = 1;
        for(int i = 1; i < n; i++){
            result[i] = Math.min(Math.min(result[index2] * 2, result[index3] * 3), result[index5] * 5);
            if(result[i] == result[index2] * 2){
                index2++;
            }
            if(result[i] == result[index3] * 3){
                index3++;
            }
            if(result[i] == result[index5] * 5){
                index5++;
            }
        }
        return result[n - 1];
    }
}
