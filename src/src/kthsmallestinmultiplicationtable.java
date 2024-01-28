import java.util.*;
public class kthsmallestinmultiplicationtable {
    static int findKthNumber(int m, int n, int k) {
        PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder());
        int [][]arr = new int [m][n];
        int row = m;
        int col = n;
        for(int i =0 ;i < m ;i++){
            for(int j =0 ; j< n ;j++){
                arr[i][j] = (i+ 1) * (j + 1);
            }
        }
        for(int i =0 ; i< arr.length;i++){
            for(int j =0 ; j< arr[0].length ;j++){
                maxH.add(arr[i][j]);
                if(maxH.size()>k){
                    maxH.remove();
                }
            }
        }
        return maxH.peek();
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3 ;
        int k =4 ;
        int s = findKthNumber(m,n,k);
        System.out.println(s);
    }
}
