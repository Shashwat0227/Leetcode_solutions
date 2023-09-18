import java.util.*;
public class ThridMaxElement {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        HashSet<Integer> hp = new HashSet<>();

        for(int i=n-1; i>=0; i--){
            int a = nums[i];
            hp.add(a);
            if(hp.size()==3) return a;
        }

        return nums[n-1];

    }
}
