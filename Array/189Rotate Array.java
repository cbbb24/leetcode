class Solution {
/**    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rot = new int[n];
        int m = k % n;
        for(int i = 0; i < n; i++){
            rot[(i + m) % n] = nums[i];            
        }
        System.arraycopy(rot, 0, nums, 0, n);
        return;
    }
*/
    public void rotate(int[] nums, int k) {
        int m = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, m-1);
        reverse(nums, m, nums.length - 1);
    }
    public void reverse(int[] array, int start, int end){
        int tmp;
        while(start <= end){
            tmp = array[start];
            array[start++] = array[end];
            array[end--] = tmp;
        }
    }
}
