class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int j = str.length()-1;
        int i = 0;

        while(i <= j) {
            char char_i = str.charAt(i);
            if(!((char_i >= '0' && char_i <= '9') || (char_i >= 'a' && char_i <= 'z'))) {
                i++;
                continue;
            }

            char char_j = str.charAt(j);
            if(!((char_j >= '0' && char_j <= '9') || (char_j >= 'a' && char_j <= 'z'))) {
                j--;
                continue;
            }

            if(char_i != char_j) { return false; }
            i++;
            j--;
        }

        return true;
    }
}
// probably would work better as a char array, can't remember syntax rn