public class RobotMove {

    private int getResult(int rows, int cols, int hold) {
        if (rows < 0 || cols < 0 || hold < 0) {
            return 0;
        }
        int res = 0;
        boolean[][] visited = new boolean[rows][cols];
        res = getResult(rows, cols, hold, 0, 0, visited);
        return res;
    }

    private int getResult(int rows, int cols, int hold,
            int row, int col, boolean[][] visited) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || getNumber(row) + getNumber(col) > hold
                || visited[row][col]) {
            return 0;
        }
        int result = 0;
        visited[row][col] = true;
        result = 1 + getResult(rows, cols, hold, row + 1, col, visited)
            + getResult(rows, cols, hold, row - 1, col, visited)
            + getResult(rows, cols, hold, row, col + 1, visited)
            + getResult(rows, cols, hold, row, col - 1, visited);
        return result;
    }

    private int getNumber(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num = num / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        RobotMove r = new RobotMove();
        System.out.println(r.getResult(3, 3, 2));
        System.out.println(r.getResult(3, 3, 0));
    }
}