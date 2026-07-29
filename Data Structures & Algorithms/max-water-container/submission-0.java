class Solution {
    public int maxArea(int[] heights) {
        int area = Integer.MIN_VALUE;
        int left = 0;
        int right = heights.length - 1;
        int product;
        while (left < right) {
            product = (right - left) * Math.min(heights[left], heights[right]);
            if (product > area) {
                area = product;
            }
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}
