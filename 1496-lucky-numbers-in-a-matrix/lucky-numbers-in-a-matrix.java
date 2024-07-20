class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();

        int maxRowMin = 0, minColMax = 0; /* try out other idea */

        for(int i = 0; i < matrix.length; i++) { // rows
            int rowMin = matrix[i][0];
            for(int j = 1; j < matrix[i].length; j++) { // cols
                if (matrix[i][j] < rowMin) { rowMin = matrix[i][j]; }
            }
            if (rowMin > maxRowMin) { maxRowMin = rowMin; }
        }

        for(int i = 0; i < matrix[0].length; i++) { // it over cols
            int colMax = matrix[0][i];
            for(int j = 1; j < matrix.length; j++) { // it over rows
                if (matrix[j][i] > colMax) { colMax = matrix[j][i]; }
            }
            if (colMax < minColMax || minColMax == 0) { minColMax = colMax; }
        }
        System.out.println(minColMax + " " + maxRowMin);
        if (minColMax == maxRowMin) { list.add(minColMax); }
        return list;
    }
}

// todo - try replacing with max to see if its faster