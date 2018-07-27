class Solution {
    public int numSquares(int n) {
/**        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        int level = 1;
        out:
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int val = queue.poll();
                for(int j = (int)Math.sqrt(val); j >= 1; j--){
                    int tmp = val - j * j;
                    if(tmp == 0){
                        break out;
                    }
                    queue.add(tmp);
                }
            }
            level++;
        }
        return level;
*/
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j * j <= i; j++){
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
