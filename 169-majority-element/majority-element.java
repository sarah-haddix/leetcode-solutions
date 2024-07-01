class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == candidate) { count++; }
            else if(nums[i] != candidate && count > 0) { count--; }
            else { candidate = nums[i]; }
        }

        return candidate;
    }
}

// obvious brute force solution
// moore's voting algorithm - i knew there was a trick
// its not even that much of a trick tbh