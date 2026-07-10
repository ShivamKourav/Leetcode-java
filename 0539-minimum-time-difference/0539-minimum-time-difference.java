class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            String s = timePoints.get(i);
            int hour = Integer.parseInt(s.substring(0,2));
            int min = Integer.parseInt(s.substring(3,5));
            arr[i] = hour*60 + min;
        }
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            ans = Math.min(ans, arr[i]-arr[i-1]);
        }
        ans = Math.min(ans, (1440-arr[n-1]+arr[0]));
        return ans;
    }
}