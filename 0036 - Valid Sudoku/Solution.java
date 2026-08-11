class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];
        
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                
                if (val == '.') {
                    continue;
                }
                
                int digit = val - '0';
                int pos = 1 << digit;
                int boxIdx = (r / 3) * 3 + (c / 3);
                
                if ((rows[r] & pos) != 0 || (cols[c] & pos) != 0 || (boxes[boxIdx] & pos) != 0) {
                    return false;
                }
                
                rows[r] |= pos;
                cols[c] |= pos;
                boxes[boxIdx] |= pos;
            }
        }
        return true;
    }
}