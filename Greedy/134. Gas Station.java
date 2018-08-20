class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] res = new int[gas.length];
        int start = 0, sum = 0, round = 1;
        for(int i = 0; i < gas.length; i++){
            res[i] = gas[i] - cost[i];
        }
        for(int i = 0; i < res.length; i++){
            if(sum >= 0){
                sum += res[i];
            }else{
                sum = res[i];
                start = i;
                if(round == 2){
                    return -1;
                }
            }
            if(((start == 0 && i == res.length - 1)|| i == start - 1) && sum >= 0)
                return start;
            if(i == res.length - 1 && start != 0){
                i = -1;
                round++;
            }
        }
        return -1;
    }
}
