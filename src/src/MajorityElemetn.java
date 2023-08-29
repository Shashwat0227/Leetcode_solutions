import java.util.*;
public class MajorityElemetn {
    public List<Integer> majorityElement(int[] nums) {
     List<Integer>res = new ArrayList<>();
     HashMap<Integer,Integer> map = new HashMap<>();
     int n = nums.length;
     for (int i =0 ; i< nums.length;i++){
         if(map.containsKey(nums[i])){
             map.put(nums[i],map.get(nums[i])+1);
         }else {
             map.put(nums[i],1 );
         }
     for(int key : map.keySet()){
         if(map.get(key)>n/3){
             res.add(map.get(key));
         }
     }
     }
    return res;
    }
}
