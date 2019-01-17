public class StringPathInMatrix {

    private boolean hasPath(char[][] matrix, int rows, int cols, char[] aim) {
        if (matrix == null || rows < 1 || cols < 1 || aim == null) {
            return false;
        }
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPath(matrix, rows, cols, aim, 0, i, j, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPath(char[][] matrix, int rows, int cols, char[] aim, int pathLength,
        int row, int col, boolean[][] visited) {
        if (pathLength == aim.length) {
            return true;
        }
        if (row < 0 || row >= rows || col < 0 || col >= cols || matrix[row][col] != aim[pathLength] ||
            visited[row][col]) {
                return false;
        }
        boolean hasPath = false;
        ++pathLength;
        visited[row][col] = true;
        hasPath = hasPath(matrix, rows, cols, aim, pathLength, row - 1, col, visited) ||
            hasPath(matrix, rows, cols, aim, pathLength, row + 1, col, visited) ||
            hasPath(matrix, rows, cols, aim, pathLength, row, col - 1, visited) ||
            hasPath(matrix, rows, cols, aim, pathLength, row, col + 1, visited);
        if (!hasPath) {
            visited[row][col] = false;
            --pathLength;
        }
        return hasPath;
    }

    public static void main(String[] args) {
        char[][] m = { {'a', 'e', 'd'}, {'h', 'l', 'm'} };
        char[] j = { 'a', 'e', 'l', 'm' };
        char[] j2 = { 'a', 'e', 'l', 'k' };
        StringPathInMatrix s = new StringPathInMatrix();
        System.out.println(s.hasPath(m, 2, 3, j));
        System.out.println(s.hasPath(m, 2, 3, j2));
    }
}