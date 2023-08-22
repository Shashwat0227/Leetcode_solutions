import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class SetMatrixZero {
    static void SetZero(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j]==0){
                    MarkRow(i,matrix);
                    Markcol(j,matrix);
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
              if(matrix[i][j]==-1){
                  matrix[i][j]=0;
              }
            }
            }
    }
    static void MarkRow(int i, int[][] matrix) {

        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }

        }
    }

    static void Markcol(int i, int[][] matrix) {

        for (int j = 0; j < matrix.length; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }

        }
    }

    public static void main(String[] args) {
        int [][]matrix ={{1,1,1},{1,0,1},{1,1,1}};
        SetZero(matrix);
        for(int i =0 ; i < matrix.length;i++){
            for(int j =0 ;j < matrix[i].length;j++){
                System.out.println(matrix[i][j] +" ");
            }
        }
        System.out.println();
    }
}