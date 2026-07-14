class Solution {
    public int maxArea(int[] height) {
        int h1 = 0;
        int h2 = height.length - 1;
        int maxArea = 0;

        while (h1 < h2) {
            int width = h2 - h1;
            int minHeight = Math.min(height[h1], height[h2]);
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if (height[h1] < height[h2]) {
                h1++;
            } else {
                h2--;
            }
        }

        return maxArea;
    }
}