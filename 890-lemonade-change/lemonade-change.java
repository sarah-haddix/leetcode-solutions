class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change = new int[2]; // 0: $5, 1: $10
        for(int i = 0; i < bills.length; i++) {
            System.out.println("Bills[i]: " + bills[i]);
            System.out.println("5s: " + change[0]);
            System.out.println("10s: " + change[1]);
            if(bills[i] == 5) { change[0]++; }
            // bills[i] == 10
            else if(bills[i] == 10){
                // need a 5 in change
                change[0]--;
                if(change[0] < 0) { return false; }
                change[1]++;
            }
            // bills[i] == 20
            else {
                // need a 10 and a 5 or 3 5s
                // since 10s can't be used for anything else, use these first
                if(change[1] > 0 && change[0] > 0) {
                    change[1]--;
                    change[0]--;
                }
                else if(change[0] >= 3) {
                    change[0] -= 3;
                }
                else { return false; }
            }
        }
        return true;
    }
}