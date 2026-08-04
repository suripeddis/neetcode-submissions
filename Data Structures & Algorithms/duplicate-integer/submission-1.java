class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>(); 
        boolean result = false;
        for(int i = 0; i < nums.length; i++) {
            if(duplicate.contains(nums[i])) {
                result = true;
            }
            duplicate.add(nums[i]);
        }
        return result;
    }
}