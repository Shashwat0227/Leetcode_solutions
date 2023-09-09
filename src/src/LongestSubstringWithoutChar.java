import java.util.*;
public class LongestSubstringWithoutChar {
    public int lengthOfLongestSubstring(String s) {
        int cnt = 0;
        int res = 0;
        int max = 0;
        HashSet<Character> hash = new HashSet();
        while (cnt < s.length()) {
            if (!hash.contains(s.charAt(cnt))) {
                hash.add(s.charAt(cnt));
                cnt++;
                max = Math.max(hash.size(), max);
            } else {
                hash.remove(s.charAt(res));
                res++;
            }
        }
        return max;
    }
}
