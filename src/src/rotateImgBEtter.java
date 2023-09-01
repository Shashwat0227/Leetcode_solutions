import java.util.*;
public class rotateImgBEtter {
    public void RotateImgreal(int [][]matrix){
        int temp =0 ;
        int left =0;
        int n = matrix.length;
        for(int row =0 ; row< n-2;row++){
            for(int col = row+1; col < n-1; col++){

                temp = matrix[row][col];
                matrix[row][col]= matrix[col][row];
                matrix[col][row]= temp;
            }
        }
    for(int row =0; row< n ;row++){
        for(int col =0 ; col < n/2;col ++ ){
            int temp1 = matrix[row][col];
            matrix[row][col]= matrix[row][matrix[row].length -1-col];
            matrix[row][matrix[row].length-1-col]=temp;
        }
    }

    }
}
