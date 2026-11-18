class Solution {
    public int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }

        int[] ways = new int[n+1]; 
        ways[1] = 1; 
        ways[2] = 2; 

        for(int i = 3; i <= n; i++) {
            int oneWay = ways[i-1];
            int secondWay = ways[i-2];
            ways[i] = oneWay + secondWay;
        }
        return ways[n];
    }
}
