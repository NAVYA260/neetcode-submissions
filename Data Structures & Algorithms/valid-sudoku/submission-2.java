class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(board[i][j]!='.') {
                    char num = board[i][j];
                    board[i][j] = '.';
                    if(!isValid(board, i, j, num)) return false;
                    board[i][j] = num;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int row, int col, char num) {
        for(int i=0;i<9;i++) {
            if(board[row][i]==num) return false;
            if(board[i][col]==num) return false;
            int r = 3*(row/3)+i/3;
            int c = 3*(col/3)+i%3;
            if(board[r][c]==num) return false;
        }
        return true;
    }
}
