class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[left];
        int maxRight = height[right];
        int totalWater = 0;
        if (height.length<2){
            return totalWater;
        }
        while(left<right) {
            if (maxLeft < maxRight) {
                totalWater += Math.min(maxLeft, maxRight) - height[left];
                left++;
                maxLeft = Math.max(height[left], maxLeft);
            } else {
                totalWater += Math.min(maxLeft, maxRight) - height[right];
                right--;
                maxRight = Math.max(height[right], maxRight);
            }
        }
        return totalWater;
    }
}
