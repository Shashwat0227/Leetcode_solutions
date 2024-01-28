import java.util.*;
public class kthsmallestelementinsortedmatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder());
        int row = matrix.length;
        int col = matrix[0].length ;
        for (int i =0 ; i< row ; i++){
            for(int j =0; j< col ; j++){
                maxH.add(matrix[i][j]);
                if(maxH.size()>k){
                    maxH.remove();
                }
            }
        }
        return maxH.peek();
    }
}
