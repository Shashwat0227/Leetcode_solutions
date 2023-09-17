import java.util.*;
public class intersectionoftwoarrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numbers = new HashSet<>();
        for (int n : nums1) { numbers.add(n); }
        int[] res = new int[numbers.size()];
        int cursor = 0;
        for (int n : nums2) {
            if (numbers.remove(n)) {
                res[cursor++] =  n;
            }
        }
        return Arrays.copyOfRange(res,0,cursor);
    }
}
