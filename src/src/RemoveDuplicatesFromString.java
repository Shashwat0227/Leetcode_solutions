import java.util.*;

public class RemoveDuplicatesFromString {
    public String removeDuplicateLetters(String s) {
        String k = "";
        char[] arr = new char[s.length()];
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return k;
    }
}
