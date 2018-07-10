class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1 = 0, count2 = 0;
        for(int i : nums)
            count2= Math.max(count2, count1 = (i == 0 ? 0 : count1 + 1));
        return count2;
    }
}
