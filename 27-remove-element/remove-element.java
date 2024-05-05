class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;

        while(i <= j) {
            // j points to the next available spot
            while(i <= j && nums[j] == val) {
                j--;
            }

            if(i >= j) {
                return j+1;
            }

            if(nums[i] == val) {
                nums[i] = nums[j];
                j--;
            }
            i++;
        }

        return j+1;
    }
}