import java.util.*;
public class biweeklyString1 {
    public boolean canBeEqual(String s1, String s2) {
        char[] ans = new char[4];
        for (int i = 0; i < s1.length(); i++) {
            ans[i] = s1.charAt(i);
        }
        for (int i : ans) {

            if (ans[i] == s2.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}