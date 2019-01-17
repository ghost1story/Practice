public class StringPathInMatrix {

    private boolean hasPath(int[][] matrix, int rows, int cols, int[] aim) {
        if (matrix == null || rows < 1 || cols < 1 || aim == null) {
            return false;
        }
        boolean[][] visited = new boolean[rows][cols];
        int pathLength = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // pathLength?
                if (hasPath(matrix, rows, cols, aim, pathLength, i, j, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPath(int[][] matrix, int rows, int cols, int[] aim, int pathLength,
        int row, int col, boolean[] visited) {
        if (pathLength == aim.length) {
            return true;
        }
        if (row < 0 || row > rows || col < 0 || col > cols || matrix[row][col] != aim[pathLength] ||
            !visited[pathLength]) {
                return false;
        }
        boolean hasPath = false;
        ++pathLength;
        visited[pathLength] = true;
        hasPath = hasPath(matrix, rows, cols, aim, pathLength, row - 1, col, visited) ||
            hasPath(matrix, rows, cols, aim, pathLength, row + 1, col, visited) ||
            hasPath(matrix, rows, cols, aim, pathLength, row, col - 1, visited) ||
            hasPath(matrix, rows, cols, aim, pathLength, row, col + 1, visited);
        if (!hasPath) {
            visited[pathLength] = false;
            --pathLength;
        }
        return true;
    }
}