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
                return true;
            } else if (n[row][col] > find) {
                col--;
            } else {
                row++;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[][] n = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(new FindPartiallySortedMatrix().isExist(n, 5));
    }
}