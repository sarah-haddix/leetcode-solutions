import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> set = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(set.containsKey(target-nums[i])) {
                result[0] = i;
                result[1] = set.get(target-nums[i]);
                return result;
            }

            set.put(nums[i], i);
        }

        return result;
    }
}