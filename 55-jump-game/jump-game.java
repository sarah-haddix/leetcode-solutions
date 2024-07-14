class Solution {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1); //-1 means that this index hasn't been accessed yet
        return create(nums, 0, dp);
    }

    private boolean create(int[] nums, int idx, int[] dp) {
        if(idx == nums.length -1) { return true; } // if we reach the end return true
        if(nums[idx] == 0) { return false; } // if we hit a zero that means we can't move anymore

        if(dp[idx] != -1) { 
            return (dp[idx] == 1) ? true : false;
        }
        int reach = idx + nums[idx]; 
        for(int jump=idx + 1; jump <= reach; jump++) {
            // account for the case where we over-jump
            if(jump < nums.length && create(nums, jump, dp)) { 
                dp[idx] = 1;
                return true; 
            }
        }

        dp[idx] = 0;
        return false;
    }
}
// recurring idea behind this question - I can make a jump to anywhere from pos to pos + nums[pos]
// recursive solution - explore every single branch

// memoization - keep an array of -1, 0 1, -1 means you havent reached it yet and 1 means you can reach it, 0 means dead end?
// iterate over every single way you could jump, keeping track of if you've jumped there before or not
// if you havn't jumped there before, then loop over all the places you could get to from there
// if you have jumped there before, return true and basically keep iterating until you hit either the end or a zero
// if you hit the end, we return true fr because we start returning true all the way up the stack
// if you hit zero, we keep exploring other branches. if that was the last branch then we start returning false all the way up the stack