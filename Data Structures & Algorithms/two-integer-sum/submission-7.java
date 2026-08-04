class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] output = new int[2]; 

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; 
            if(!map.containsKey(complement)) {
                map.put(nums[i], i);
            }
            else {
                output[0] = map.get(complement);
                output[1] = i;
            }
        }
        return output;
        
    }
}
