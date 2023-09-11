import java.util.*;
public class contestq1 {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] numLine = new int[1001];
        int []car = new int [ nums.size()];
        int count1 =0;
        for (int i =0 ; i < nums.size();i++){
            car[i]= nums.get(i).get(count1);
            count1++;
        }
        for (int car1:car) {
            int start = car[0];
            int end = car[1];
            for (int i = start; i <= end; i++) {
                numLine[i + 1000] = 1;
            }
        }
        int count = 0;
        for (int point : numLine) {
            if (point == 1) {
                count++ ;
            }
        }
        return count;
    }
}
