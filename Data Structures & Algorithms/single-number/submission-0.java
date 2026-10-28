class Solution {
    public int singleNumber(int[] nums) {
        int sol = 0;
        for (int n : nums) {
            sol ^= n;
        }
        return sol;
    }
}
