class Solution {
    public int coinChange(int[] coins, int amount) {
        // 0 ways to get 0 coins, no ways to get i coins yet
        int[] memo = new int[amount+1];
        for(int i = 1; i < memo.length; i++) {
            memo[i] = -1;
        }

        for(int i = 1; i <= amount; i++) { //ways to get each amount of coins, counting up from 1
            for(int j = 0; j < coins.length; j++) { //iterate through coins
                if(i - coins[j] >= 0) { //feasible
                    if(memo[i] != -1 || memo[i-coins[j]] != -1) {
                    if(memo[i] != -1 && memo[i-coins[j]] != -1) {memo[i] = Math.min(memo[i], memo[i-coins[j]] + 1);}
                    if(memo[i] == -1) { memo[i] = memo[i-coins[j]] + 1; }
                    if(memo[i-coins[j]] == -1) { memo[i] = memo[i]; }
                    }
                }
            }
        }

        return memo[amount];
    }
}

// using dp approach with memoization
// keep an array of ways to get to i amount of money