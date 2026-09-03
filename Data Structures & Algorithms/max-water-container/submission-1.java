class Solution {
    public int maxArea(int[] heights) {
       int left = 0;
       int right = heights.length - 1;
       int area = 0;
       int maxArea = 0;
       while(left < right){
            if(heights[left] <= heights[right]){
                area = heights[left] * (right - left);
                if(area > maxArea){
                    maxArea = area;
                }
                left++;
            } else {
                area = heights[right] * (right - left);
                if(area > maxArea){
                    maxArea = area;
                }
                right--;
            }
       }
       return maxArea;
    }
}
