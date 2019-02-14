import java.util.ArrayList;

public class PrintMatrix {

    ArrayList print(int[][] matrix) {
        if (matrix == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int row = 0;
        int rows = matrix.length - 1;
        int col = 0;
        int cols = matrix[0].length - 1;
        while (row <= rows && col <= cols) {
            for (int i = col; i <= cols; i++) {
                list.add(matrix[row][i]);
            }
            for (int i = row + 1; i <= rows; i++) {
                list.add(matrix[i][cols]);
            }
            if (row != rows) {
                for (int i = cols - 1; i >= col; i--) {
                    list.add(matrix[rows][i]);
                }
            }
            if (col != cols) {
                for (int i = rows - 1; i >= row + 1; i--) {
                    list.add(matrix[i][col]);
                }
            }
            row++;
            rows--;
            col++;
            cols--;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] i = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] i2 = { {1, 2, 3} };
        int[][] i3 = { {3}, {6}, {5} };
        int[][] i4 = { {9} };
        int[][] i5 = { {1, 3, 8, 4}, {4, 5, 6, 7}, {1, 7, 8, 9} };
        
        PrintMatrix p = new PrintMatrix();
        System.out.println(p.print(i));
        System.out.println(p.print(i2));
        System.out.println(p.print(i3));
        System.out.println(p.print(i4));
        System.out.println(p.print(i5));
    }
}