import java.util.Arrays;

public class multiplicationtable {
    static int[][] multiplication(int m, int n) {
        int[][] arr = new int[m][n];
        int row = m;
        int col = n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (i+ 1) * (j + 1);
            }
        }
 return arr;
    }

    public static void main(String[] args) {
        int [][]matrix = multiplication(3,3);
        System.out.println(Arrays.deepToString(matrix));
    }
}
