class Solution {
    public boolean isGroupValid(char[][] board, int rowStart, int rowEnd, int colStart, int colEnd) {
        HashSet<Character> seen = new HashSet<Character>();
        for (int i = rowStart; i < rowEnd; i++) {
            for (int j = colStart; j < colEnd; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                boolean added = seen.add(board[i][j]);
                if (!added) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        int numberOfRows = board.length;
        int numberOfCols = board[0].length;

        // rows
        for (int i = 0; i < numberOfRows; i++) {
            if (!isGroupValid(board, i, i + 1, 0, numberOfCols))
                return false;
        }

        // columns
        for (int i = 0; i < numberOfCols; i++) {
            if (!isGroupValid(board, 0, numberOfRows, i, i + 1))
                return false;
        }

        // 3x3 boxes
        for (int i = 0; i < numberOfRows; i += 3) {
            for (int j = 0; j < numberOfCols; j += 3) {
                if (!isGroupValid(board, i, i + 3, j, j + 3))
                    return false;
            }
        }

        return true;
    }


}
