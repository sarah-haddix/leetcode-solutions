class Solution {
    public int numTeams(int[] rating) {
        int len = rating.length;
        int[] arr = new int[len];
        int count = 0;

        // forwards checking
        for(int i = 0; i < len; i++) {
            for(int j = i-1; j >= 0; j--) {
                if(rating[i] > rating[j]) {
                    arr[i]++;
                    count = count + arr[j];
                    // add one for all the numbers with a greater rating behind it
                    // for the count var, you can add one when there's a one behind you (meaning row of 3)
                }
            }
        }

        arr = new int[len];

        // backwards checking
        for(int i = 0; i < len; i++) {
            for(int j = i-1; j >= 0; j--) {
                if(rating[i] < rating[j]) {
                    arr[i]++;
                    count = count + arr[j];
                }
            }
        }

        return count;
    }
}

// factorial situation - intractable
// go through twice using jump game esque solution
// try brute force and memoization? ***
// put into a binary tree, depth of each branch type thing