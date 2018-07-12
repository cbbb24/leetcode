class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m + n - 1, i = m -1, j = n -1;
        while(i > -1 && j > -1){
            nums1[x--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j > -1){
            nums1[x--] = nums2[j--];
        }
        return;        
    }
}
