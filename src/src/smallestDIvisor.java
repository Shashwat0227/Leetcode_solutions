import java.util.*;
public class smallestDIvisor {
    public int smallestDivisor(int[] nums, int threshold) {
       int []arr = new int [nums.length];
       int k=0,s=0,q=0;
       int []res = new int [nums.length];
        int count =nums[s];
        for (int i = 0; i < nums.length; i++) {
         arr[i]=+nums[k]/count;
         k++;
         if(arr[i]<=threshold){
             res[q]=arr[i];
         }

        }
   Arrays.sort(res);
        for(int i =0; i< res.length ;i++){
            if(res[i]!=0){
                return res[i];
            }
        }
    return threshold;
    }
}