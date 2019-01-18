public class RobotMove {

    private int getResult(int[][] matrix, int rows, int cols, int hold) {
        if (matrix == null || rows < 1 || cols < 1) {
            return -1;
        }
        int res = 0;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res = getResult();
            }
        }
        return res;
    }

    private int getResult(int[][] matrix, int rows, int cols, int hold,
            int row, int col, boolean[][] visited) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || getNumber(row, col) > hold ||
                visited[row][col]) {
            return -1;
        }
    }
}