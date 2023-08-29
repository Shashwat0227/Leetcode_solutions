import java.util.*;
public class MajorityElemetn {
    public List<Integer> majorityElement(int[] nums) {
    Arrays.sort(nums);
     List<Integer>res = new ArrayList<>();
     HashMap<Integer,Integer> map = new HashMap<>();
     int n = nums.length;
     for (int i =0 ; i< n;i++) {
         if (map.containsKey(i)) {
             map.put(i, map.get(i) + 1);
         } else {
             map.put(i, 1);
         }
     }
         for(int key : map.keySet()){
         if(map.get(key)>n/3){
             res.add(map.get(key));
         }
     }

    return res;
    }
}
