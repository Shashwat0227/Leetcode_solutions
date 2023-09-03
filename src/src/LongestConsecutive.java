import java.util.*;

public class LongestConsecutive {
    public int LongestConsecutive(int []nums){
        int fi =0;
        Set<Integer> set = new HashSet<>();
        for (int i =00 ; i< nums.length;i++) {
            set.add(nums[i]);
        }
            for(int i =0 ; i< nums.length ;i++){
                int count =1;
              int num = nums[i];
              while (set.contains(--num)){
                  count++;
                  set.remove(num);
              }
              num = nums[i];
            while(set.contains(++num)){
                count++;
                set.remove(num);
            }
                fi = Math.max(fi , count);
            }
 return fi;

    }
}
