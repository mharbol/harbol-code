
package io.github.mharbol.leetcode;

/**
 * SudokuSolver
 * Solution class for Leet Code 37
 */
public class SudokuSolver {

    /**
     * Solves a sudoku puzzle.
     * 
     * @param board the sudoku puzzle as a 9x9 array
     */
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    /**
     * Actually solves the sudoku puzzle with a classic backtracking algorithm.
     *
     * @param puzzle the sudoku puzzle
     * @param row    the row currently evaluating
     * @param col    the column currently evaluating
     */
    private boolean solve(char[][] puzzle, int row, int col) {
        if (9 == row) { // solved!
            return true;
        }
        if (9 == col) { // col overflow
            return solve(puzzle, row + 1, 0);
        }
        if ('.' != puzzle[row][col]) { // default value, move on
            return solve(puzzle, row, col + 1);
        }
        for (char guess = '1'; guess <= '9'; guess++) {
            puzzle[row][col] = guess;
            if (isValidPlacement(puzzle, row, col) && solve(puzzle, row, col + 1)) {
                return true;
            }
        }
        puzzle[row][col] = '.';
        return false;
    }

    /**
     * Determine if the placement is valid
     * 
     * @param puzzle the sudoku puzzle
     * @param row    the row of the value updated
     * @param col    the column of the value updated
     */
    private boolean isValidPlacement(final char[][] puzzle, final int row, final int col) {

        // use the bits to determine if a number has been used already
        int numLog = 0;
        int shiftIdx;
        char cellVal;

        // check current row
        for (int idx = 0; idx < 9; idx++) {
            cellVal = puzzle[row][idx];
            if ('.' == cellVal) {
                continue;
            }
            shiftIdx = 1 << (cellVal - '1');
            if (0 != (numLog & shiftIdx)) {
                return false;
            }
            numLog |= shiftIdx;
        }

        // check column
        numLog = 0;
        for (int idx = 0; idx < 9; idx++) {
            cellVal = puzzle[idx][col];
            if ('.' == cellVal) {
                continue;
            }
            shiftIdx = 1 << (cellVal - '1');
            if (0 != (numLog & shiftIdx)) {
                return false;
            }
            numLog |= shiftIdx;
        }

        // check sub-square
        numLog = 0;
        final int rowStart = (row / 3) * 3;
        final int colStart = (col / 3) * 3;
        for (int rowIdx = rowStart; rowIdx < rowStart + 3; rowIdx++) {
            for (int colIdx = colStart; colIdx < colStart + 3; colIdx++) {
                cellVal = puzzle[rowIdx][colIdx];
                if ('.' == cellVal) {
                    continue;
                }
                shiftIdx = 1 << (cellVal - '1');
                if (0 != (numLog & shiftIdx)) {
                    return false;
                }
                numLog |= shiftIdx;
            }
        }
        return true;
    }
}
