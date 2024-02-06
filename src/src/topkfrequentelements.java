import java.util.*;
public class topkfrequentelements {
    //using hashmap

        static int[] topKFrequent(int[] nums, int k) {

            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i =0; i< nums.length ; i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }else {
                    map.put(nums[i],1);
                }
            }
            List<Integer> lst = new ArrayList<>(map.keySet());
            lst.sort((a, b)-> map.get(b)-map.get(a));
            int []res = new int[k];
            for(int i =0 ; i< k ;++i){
                res[i]= lst.get(i);
            }
    return res;
        }

    public static void main(String[] args) {
        int []arr = {1,1,1,2,2,2,3,3,4};
        int []ans = topKFrequent(arr,2);
        System.out.println(Arrays.toString(ans));

    }
}
