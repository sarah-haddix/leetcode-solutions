class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;

        for(int i = 0; i < nums.length; i++) {
            if(reach < i) { return false; }
            reach = Math.max(reach, i + nums[i]);
        }

        return true;
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

// dp tabulation (less stack space)
// get rid of create function
// dp array full of zeroes size of nums
// start at the last one in the list = 1
// iterate through backwards, defining the reach of each spot you go over
// at each spot, iterate forwards over all the spots you can reach in front of you
// if you can reach the end or like a path TO the end via this spot, this becomes part of a path TO the end
// basically go over the entire thing and if you find out that the very first spot is a path TO the end, we're good

// similar to Kadane's algorithm
// greedy - keep track of max reach
// for each index check if the reach was able to get to that spot. if it wasn't then we're fucked. if it was, incremement the max reach and carry on