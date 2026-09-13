class Solution {
    int[] t;
    public int climbStairs(int n) {
        t = new int[n+1];
        return solve(n);
    }
    public int solve(int n){
        if(n==0 || n==1)  return 1;
        if(t[n] != 0) return t[n];

        return t[n] = solve(n-1) + solve(n-2);
    }
}