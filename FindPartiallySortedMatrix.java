public class FindPartiallySortedMatrix {

    private boolean isExist(int[][] n, int find) {
        boolean res = false;
        if (n == null) {
            return false;
        }
        int rows = n.length;
        int cols = n[0].length;
        int row = 0;
        int col = cols - 1;
        while (row < rows && col >= 0) {
            if (n[row][col] == find) {
                res = true;
            } else if (n[row][col] > find) {
                col--;
            } else {
                row++;
            }
        }
        return res;
    }
}