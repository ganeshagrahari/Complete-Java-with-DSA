class Solution {
    // Method to check if placing a number at board[row][col] is safe
    public boolean isSafe(char[][] board, int row, int col, int num) {
        // Check the row and column for the same number
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char) (num + '0')) {
                return false;
            }
            if (board[i][col] == (char) (num + '0')) {
                return false;
            }
        }
        // Check the 3x3 grid for the same number
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (num + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    // Recursive helper method to solve the Sudoku
    public boolean helper(char[][] board, int row, int col) {
        // If we have reached the end of the board (last row), the Sudoku is solved
        if (row == board.length) {
            return true;
        }

        // Determine the next cell to process
        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) {
            // Move to the next column in the same row
            nrow = row;
            ncol = col + 1;
        } else {
            // Move to the first column of the next row
            nrow = row + 1;
            ncol = 0;
        }

        // If the current cell is already filled, move to the next cell
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            // Try placing numbers 1 to 9 in the current cell
            for (int i = 1; i <= 9; i++) {
                // Check if placing the number is safe
                if (isSafe(board, row, col, i)) {
                    // Place the number
                    board[row][col] = (char) (i + '0');
                    // Recursively attempt to solve the rest of the board
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        // If placing the number didn't lead to a solution, backtrack
                        board[row][col] = '.';
                    }
                }
            }
        }
        // If no number can be placed in the current cell, return false
        return false;
    }

    // Public method to initiate the solving process
    public void solveSudoku(char[][] board) {
        // Start solving from the top-left corner of the board
        helper(board, 0, 0);
    }
}

public class main {
    public static void main(String[] args) {
        // Example usage
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        Solution solution = new Solution();
        solution.solveSudoku(board);
        // Print the solved board
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}