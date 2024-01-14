import java.util.*;
public class q2Contest1 {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> result = new ArrayList<>();
        List<Integer> myIndices = new ArrayList<>();
        for (int i = 0; i <= s.length() - a.length(); i++) {
            if (s.substring(i, i + a.length()).equals(a)) {
                myIndices.add(i);
            }
        }


        for (int myIndex : myIndices) {
            for (int j = Math.max(0, myIndex - k); j <= Math.min(s.length() - b.length(), myIndex + k); j++) {
                if (s.substring(j, j + b.length()).equals(b) && Math.abs(j - myIndex) <= k) {
                    result.add(myIndex);
                    break;
                }
            }
        }

        return result;
    }
}
