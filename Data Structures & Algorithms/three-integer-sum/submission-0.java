class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } 
             int left = i+1; 
             int right = nums.length - 1;
            while(left < right) {
                List<Integer> list = new ArrayList<>();
                if(nums[left] + nums[right] == -(nums[i])) {
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(nums[i]);
                    lists.add(list);
                    left++; 
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]){
                        right--;
                    } 
                }
                else if(nums[left] + nums[right] < -(nums[i])){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
       return new ArrayList<>(lists);
    }
}
