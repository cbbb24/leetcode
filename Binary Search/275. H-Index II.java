class Solution {
    public int hIndex(int[] citations) {
        int left = 0, right = citations.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int midNum = citations[mid];
            if(midNum == citations.length - mid){
                return midNum;
            }else if(midNum < citations.length - mid){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return citations.length - left;
    }
}
