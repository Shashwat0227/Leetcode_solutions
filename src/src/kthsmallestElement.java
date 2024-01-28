import java.util.*;
public class kthsmallestElement {
    // kth smallest element using Min  Heap
    static int kthSmallest(int[] nums, int k) {
     PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder());

        for (int i =0 ; i < nums.length ; i++){
         maxH.add(nums[i]);
         if (maxH.size()>k){
             maxH.remove();
         }
     }
    return maxH.peek();
    }

    public static void main(String[] args) {
        int [] nums = {3,10,7,4,2,6};
        int s = kthSmallest(nums,3);
        System.out.println(s);
    }
}
