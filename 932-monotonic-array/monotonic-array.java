class Solution {
    public boolean isMonotonic(int[] nums) {
        //iterate through nums and nums+1 until either nums>nums+1. when this condition is met, break the loop and go to one of the conditions. if everythings equal, skip the conditions and return true
        //if nums>nums+! mono increasing, iterate though both until something doesn't fit that pattern and return false
        //if nums<nums+1 mono decreasing, iterate through both until something doesn't fit that pattern and return false
        //return true
        if (nums.length < 2) return true;
        
        int i = 0;

        while(i < nums.length-2 && nums[i] == nums[i+1]){
            i++;
        }
        
        if(nums[i] > nums[i+1]){
            while(i < nums.length-2){ 
                i++;
                if(nums[i] < nums[i+1]){
                    return false;
                }
            }
        }

        if(nums[i] < nums[i+1]){
            while(i < nums.length-2){
                i++;
                if(nums[i] > nums[i+1]){ 
                    return false;
                }
            }
        }

        return true;
    }
}