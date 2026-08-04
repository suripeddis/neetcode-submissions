class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] output = new int[2]; 
        int k = 0; 
        for(int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; 
            if(map.containsKey(complement) && map.get(complement) != i) {
                if(k >= 2) {
                    break;
                }

                output[k] = i;
                k++; 
                output[k] = map.get(complement);
                k++;
            }
        }
        return output;
    }
}
