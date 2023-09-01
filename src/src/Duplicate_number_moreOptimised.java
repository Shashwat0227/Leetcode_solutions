import java.util.*;

public class Duplicate_number_moreOptimised {

    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp=0;
        for (int i:nums){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);

            }else {
                map.put(i,1);
            }
        }
    for(int key: map.keySet()){
        if(map.get(key)>1){
            temp = key;
        }
    }
    return temp ;
    }
}
