import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] != '.') {
                    if(
                        !seen.add(board[i][j] + " in row " + i) ||
                        !seen.add(board[i][j] + " in col " + j) ||
                        !seen.add(board[i][j] + " in block " + (int)(i/3) + ", " + (int)(j/3))
                    ) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

// go through each row, col, box and check rules. since it's a set size array, should be O(n)
// can use a hashmap for each of the nine numbers that resets every time
// i iterates ^^
// j iterates >>