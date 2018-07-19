class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum, rem;
        while(set.add(n)){
            sum = 0;
            while(n > 0){
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum;
            if(n == 1) return true;
        }
        return false;
    }
}
