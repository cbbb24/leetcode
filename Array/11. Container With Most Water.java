public class Solution {
    public int maxArea(int[] height) {
/**
        int maxarea = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
        return maxarea;
*/
        int start = 0;
        int end = height.length - 1;
        int maxarea = 0;
        while(start < end){
            maxarea = Math.max(maxarea, Math.min(height[start], height[end]) * (end - start));
            if(height[end] > height[start])
                start++;
            else
                end--;
        }
        return maxarea;
        
    }
}
