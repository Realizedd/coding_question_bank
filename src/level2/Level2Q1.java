package level2;

public class Level2Q1 {

    private int safeIndex(int[][] arr, int r, int c) {
        return (r < 0 || c < 0) ? 0 : arr[r][c];
    }

    public int solution(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int max = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 0) {
                    continue;
                }

                int around = Math.min(Math.min(safeIndex(board, r - 1, c), safeIndex(board, r, c - 1)), safeIndex(board, r - 1, c - 1)) + 1;
                board[r][c] = around;
                max = Math.max(max, around);
            }
        }

        return max * max;
    }
}
