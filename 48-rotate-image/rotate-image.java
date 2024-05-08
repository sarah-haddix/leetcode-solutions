class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;

        // transpose
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse columns
        int j = N-1;
        for(int i = 0; i < N/2; i++) {
            for(int k = 0; k < N; k++) {
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
            }
            j--;
        }
    }
}